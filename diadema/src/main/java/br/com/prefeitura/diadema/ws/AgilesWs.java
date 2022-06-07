package br.com.prefeitura.diadema.ws;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.ws.agiles.AgilesUser;
import br.com.prefeitura.diadema.ws.agiles.SingleSignOnServices;
import br.com.prefeitura.diadema.ws.agiles.SingleSignOnServices_Service;

@Service
public class AgilesWs {
	
	private final String AGILES = "agiles";
	
	public AgilesWs(){
		
	}
	

	//public static void main(String[] arg) throws MalformedURLException	 {
		/*final String username = "agiles";
	    final String password = "agiles";
 	    Authenticator.setDefault(new Authenticator() {
	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password.toCharArray());
	        }
	    });
 	    
 	    
 	    SingleSignOnServices_Service o = new SingleSignOnServices_Service();
 	    SingleSignOnServices port = o.getPort(SingleSignOnServices.class);
 	   
 	    try{
 	    	Response<UsuarioDto> r = new Response<UsuarioDto>();
 	    	AgilesUser agilesUser = port.login("anderson.oliveira", "Sata2811", "172.16.4.39");
 	    	
 	    	r.
 	    	
 	    	
 	    	
 	   }catch(com.sun.xml.internal.ws.fault.ServerSOAPFaultException ex){
 		  Response<UsuarioDto> r = new Response<UsuarioDto>();
 		  r.addError("Usuario senha invalido");
 		  r.setErro(true);
 	   }*/
		
	//}
	
	public AgilesUser loginAgiles(String usuario, String senha){
		final String username = AGILES;
	    final String password = AGILES;
 	    Authenticator.setDefault(new Authenticator() {
	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password.toCharArray());
	        }
	    });
 	    
 	    
 	    SingleSignOnServices_Service o = new SingleSignOnServices_Service();
 	    SingleSignOnServices port = o.getPort(SingleSignOnServices.class);
 	   
 	    try{ 	    	
 	    	AgilesUser agilesUser = port.login(usuario, senha, "172.16.4.39"); 	    	
 	    	return agilesUser;
 	   }catch(Exception ex){
 		   ex.printStackTrace();
 		 return null;
 	   }
	}
	
	
	/*
	public UsuarioDto getUserById(String pk){
		final String username = AGILES;
	    final String password = AGILES;
 	    Authenticator.setDefault(new Authenticator() {
	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password.toCharArray());
	        }
	    });
		
		RolesServices_Service o = new RolesServices_Service();
		RolesServices port = o.getPort(RolesServices.class);
		     
		try{  
			
			Response<UsuarioDto> r = new Response<UsuarioDto>();
			AgilesUser userAgiles = port.getUserByPk(pk);
	       
			//r.setData(data);
			//UsuarioDto usuario = new UsuarioDto();
			//usuario.setCpf(cpf);
	        
	        return r;
	    	
	    }catch(com.sun.xml.internal.ws.fault.ServerSOAPFaultException ex){
	    	Response<UsuarioDto> r = new Response<UsuarioDto>();
	    	r.setErro(true);
	    	r.addError("Código do usuario não existe/ou não esta cadastrado no sistema" + pk);
	    	return r;
	    }
        
		*/
		
		

	
	
	
	
	
}
