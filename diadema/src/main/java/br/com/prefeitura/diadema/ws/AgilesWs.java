package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/
import org.springframework.stereotype.Service;

/*
import br.com.prefeitura.diadema.ws.agiles.AgilesUser;
import br.com.prefeitura.diadema.ws.agiles.RolesServices;
import br.com.prefeitura.diadema.ws.agiles.RolesServices_Service;
import br.com.prefeitura.diadema.ws.agiles.SingleSignOnServices;
import br.com.prefeitura.diadema.ws.agiles.SingleSignOnServices_Service;
import br.com.prefeitura.diadema.ws.agiles.UtilServices;
import br.com.prefeitura.diadema.ws.agiles.UtilServices_Service;
*/
/**
 * CURIOSIDADE DE COMO O AGILES FUNCIONA AQUI RS
 * @author anderson.oliveira
 *
 */
@Service
public class AgilesWs {

	/*private final String AGILES = "agiles";

	public AgilesWs() {
		final String username = AGILES;
		final String password = AGILES;
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password.toCharArray());
			}
		});
	}
	
	public  static void main(String args[]){
		AgilesWs w = new AgilesWs();
		w.desactiveUserAgiles("1-607");
		
	}
	
	public void desactiveUserAgiles(String pk) {
		
		RolesServices_Service o2 = new RolesServices_Service();
		RolesServices port2 = o2.getPort(RolesServices.class);
		
		UtilServices_Service o = new UtilServices_Service();
		UtilServices port = o.getPort(UtilServices.class);
		
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);

		try {
			AgilesUser agilesUser = port2.getUserByPk(pk);
			agilesUser.setActive(false);
			agilesUser.setDescription("Usuario desativado - " + data);
			//if(agilesUser.isActive()){
				port.modifyUser(agilesUser);
			//}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void updateUser(UsuarioDto usuario) {
		RolesServices_Service o2 = new RolesServices_Service();
		RolesServices port2 = o2.getPort(RolesServices.class);
		
		UtilServices_Service o = new UtilServices_Service();
		UtilServices port = o.getPort(UtilServices.class);

		try {
			AgilesUser agilesUser = port2.getUserByPk(usuario.getPkUsuarioAgiles());			
			agilesUser.setDescription("Prontuario: " + usuario.getProntuario());
			agilesUser.setDisplayName(usuario.getNome());
			agilesUser.setEmail(usuario.getEmail());			
			if(agilesUser.isActive()){
				port.modifyUser(agilesUser);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}


	public AgilesUser loginAgilesByToken(String token) {
		final String username = AGILES;
		final String password = AGILES;
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password
						.toCharArray());
			}
		});

		SingleSignOnServices_Service o = new SingleSignOnServices_Service();
		SingleSignOnServices port = o.getPort(SingleSignOnServices.class);

		try {
			AgilesUser agilesUser = port.getLoggedUser(token, "172.16.4.39");
			return agilesUser;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public AgilesUser loginAgiles(String usuario, String senha) {
		final String username = AGILES;
		final String password = AGILES;
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password
						.toCharArray());
			}
		});

		SingleSignOnServices_Service o = new SingleSignOnServices_Service();
		SingleSignOnServices port = o.getPort(SingleSignOnServices.class);

		try {
			AgilesUser agilesUser = port.login(usuario, senha, "172.16.4.39");
			return agilesUser;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	
	/*
	 * public UsuarioDto getUserById(String pk){ final String username = AGILES;
	 * final String password = AGILES; Authenticator.setDefault(new
	 * Authenticator() {
	 * 
	 * @Override protected PasswordAuthentication getPasswordAuthentication() {
	 * return new PasswordAuthentication(username, password.toCharArray()); }
	 * });
	 * 
	 * RolesServices_Service o = new RolesServices_Service(); RolesServices port
	 * = o.getPort(RolesServices.class);
	 * 
	 * try{
	 * 
	 * Response<UsuarioDto> r = new Response<UsuarioDto>(); AgilesUser
	 * userAgiles = port.getUserByPk(pk);
	 * 
	 * //r.setData(data); //UsuarioDto usuario = new UsuarioDto();
	 * //usuario.setCpf(cpf);
	 * 
	 * return r;
	 * 
	 * }catch(com.sun.xml.internal.ws.fault.ServerSOAPFaultException ex){
	 * Response<UsuarioDto> r = new Response<UsuarioDto>(); r.setErro(true);
	 * r.addError
	 * ("Código do usuario não existe/ou não esta cadastrado no sistema" + pk);
	 * return r; }
	 */

}
