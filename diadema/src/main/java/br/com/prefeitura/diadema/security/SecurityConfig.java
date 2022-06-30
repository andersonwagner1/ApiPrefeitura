package br.com.prefeitura.diadema.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
	/*public void configure(HttpSecurity httpSec) throws Exception{
		httpSec.csrf().disable()
		.authorizeHttpRequests()
		.antMatchers(HttpMethod.POST, "/api/prefeitura/login").permitAll()		
		.anyRequest().authenticated().and().cors()	
        .and()
        .csrf().disable();
        
		
		//criar filtro
		httpSec.addFilterBefore(new SecurityFilter(), UsernamePasswordAuthenticationFilter.class);
	}*/
}
