package br.com.prefeitura.diadema.ws.egata.dto;

import java.net.URL;
import java.util.Properties;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import br.com.prefeitura.diadema.ws.egata.execute.ObjectFactory;
import br.com.prefeitura.diadema.ws.egata.execute.AuthenticationHeader;
import br.com.prefeitura.diadema.ws.egata.execute.ILicenciamento;
import br.com.prefeitura.diadema.ws.egata.execute.ListarSolicitacoesPorDataIn;
import br.com.prefeitura.diadema.ws.egata.execute.ListarSolicitacoesPorDataOut;

public class LicenciamentoClient {

    private static final String WSDL_URL = "https://www.jucesp.sp.gov.br/Jucesp.Services/Licenciamentos/Licenciamento.svc?wsdl";
    private static final QName SERVICE_NAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "Licenciamento");
    private static final QName PORT_NAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "LicenciamentoPort");

    public static void main(String[] args) {
        try {
            URL wsdlURL = new URL(WSDL_URL);
            Service service = Service.create(wsdlURL, SERVICE_NAME);
            ILicenciamento port = service.getPort(ILicenciamento.class);
            
            
           

            

            // Set credentials in request context
            BindingProvider bindingProvider = (BindingProvider) port;
            bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "prefeitura.redesim");
            bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "@#RedeSim#@");

            // Create request
            ListarSolicitacoesPorDataIn request = new ListarSolicitacoesPorDataIn();
            
            // Create AuthenticationHeader and set username and password
            AuthenticationHeader authHeader = new AuthenticationHeader();
            authHeader.setUsername(new JAXBElement<>(new QName("Jucesp.Services.Data/01", "Username"), String.class, "diadema.redesim"));
            authHeader.setPassword(new JAXBElement<>(new QName("Jucesp.Services.Data/01", "Password"), String.class, "161.redesim"));
            
            // Create JAXBElement for AuthenticationHeader
            ObjectFactory factory = new ObjectFactory();
            JAXBElement<AuthenticationHeader> authHeaderElement = factory.createAuthenticationHeader(authHeader);
            
            // Set the AuthenticationHeader in the request
            request.setAuthenticationHeader(authHeaderElement);
            
            // Set dates
            request.setDataInicial("2024-07-03T00:00:00");
            request.setDataFinal("2024-07-03T23:59:59");

            // Call service
            ListarSolicitacoesPorDataOut response = port.listarSolicitacoesPorData(request);

            // Handle response
            System.out.println("Response: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
