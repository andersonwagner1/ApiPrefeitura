package br.com.prefeitura.diadema.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
public class TokenUtils {
	
	private static final String HEADER = "Authorization";
	private static final String PREFIX ="Bearer ";
	private static final long EXPIRATION = 1000 * 60 * 60 * 12;
	private static final String SECRET_KEY = "Q23KRWQIOUSAFQ89Q234QDADVASOIUGF";
											  
	private static final String EMISSOR =  "AWO";
	
	public static String createToken(String usuarioModel){
	//	Key secretKey = Ke
		Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

		String token = Jwts.builder()
				.setSubject(usuarioModel)
				.setIssuer(EMISSOR)
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
				.signWith(key, SignatureAlgorithm.HS256)
				.compact();
		
		//return PREFIX + token; // REMOVIDO POR O SISTEMA JA TEM O BERARER
		return token;
	}
	
	private static boolean isExpirationValid(Date expiration){
		return expiration.after(new Date(System.currentTimeMillis()));
	}
	
	private static boolean isEmissorValid(String emissor){
		return emissor.equals(EMISSOR);
	}
	
	private static boolean isSubjetValid(String userName){
		return userName != null && userName.length() > 0;
	}
	
	public static Authentication validate(HttpServletRequest request){
		String token = request.getHeader(HEADER);
		token = token.replace(PREFIX, "");
		token = token.replace(PREFIX, "");//esta vindo duplicado
		Jws<Claims> jwsClains = Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes())
				.build()
				.parseClaimsJws(token);
		
		String userName = jwsClains.getBody().getSubject();
		String isser = jwsClains.getBody().getIssuer();
		Date expira = jwsClains.getBody().getExpiration();
		
		if(isSubjetValid(userName) && isEmissorValid( isser) && isExpirationValid(expira)){
			return new UsernamePasswordAuthenticationToken(userName, null, null);
		}
		return null;
	}
}
