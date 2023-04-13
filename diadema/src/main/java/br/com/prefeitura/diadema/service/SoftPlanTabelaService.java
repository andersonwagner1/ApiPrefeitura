package br.com.prefeitura.diadema.service;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.util.ExecutarQuery;

@Service
public class SoftPlanTabelaService {
	
	public static void main(String main[]) {
	/*	SoftPlanTabelaService s = new SoftPlanTabelaService();
		
		HttpClient client = HttpClient.newHttpClient();
		
		
		// criar a requisição
		HttpRequest request = HttpRequest.newBuilder()
		          .GET()
		          .timeout(Duration.ofSeconds(10))
		          .uri(URI.create(URL_GET))
		          .build();
		
		
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		*/
		//imprimir o conteúdo recebido
	//	System.out.println(response.statusCode());
	//	System.out.println(response.body());
		
	//	s.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(null,null,null);
	}
	

	
	public Object[][]  listarUsuariosMuitoTempoSemAcessar(){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT U.CDUSUARIO, U.NMUSUARIO, U.DTATIVACAO, U.DTULTLOGINOK FROM ESEGUSUARIO U");
		sql.append(" WHERE U.FLHABILITADO = 'S'");
		sql.append(" AND U.DTULTLOGINOK < (SYSDATE -30)");	
		
		ExecutarQuery e = new ExecutarQuery();
		return e.executarQueryMatriz(sql.toString());
		
		
	}
	
	
	
}
