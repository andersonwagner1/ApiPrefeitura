package br.com.prefeitura.diadema.dto.grafico;

import br.com.prefeitura.diadema.dto.RelatorioDto;

public class Converter {
	
	public RelatorioDto conveter(Object[][] resultado, boolean grafico, String... colunas){
		// LISTA DE CORES para os grafico
				String[] cores = { "#00008B", "#008B8B", "#228B22", "#A020F0",
						"#8B4513", "#7CFC00", "#7FFF00", "#9ACD32", "#D2B48C",
						"#7B68EE", "#000000", "#1C1C1C", "#363636", "#4F4F4F",
						"#696969", "#808080", "#A9A9A9", "#C0C0C0", "#D3D3D3",
						"#DCDCDC", "#6A5ACD", "#836FFF", "#6959CD", "#483D8B",
						"#191970", "#000080", "#00008B", "#0000CD", "#0000FF",
						"#6495ED", "#4169E1", "#1E90FF", "#00BFFF", "#87CEFA",
						"#87CEEB", "#ADD8E6", "#4682B4", "#B0C4DE", "#708090",
						"#778899", "#00CED1", "#40E0D0", "#48D1CC", "#20B2AA",
						"#008B8B", "#008080", "#7FFFD4", "#66CDAA", "#5F9EA0",
						"#2F4F4F", "#00FA9A", "#00FF7F", "#98FB98", "#FF00FF"};
				
				if(resultado.length==0){
					RelatorioDto relatorio = new RelatorioDto();
					relatorio.setColunas(colunas);
					
					
					//Valores da valores do dados
					DataSetsBar[] barras = new DataSetsBar[1];
					Double[] d = new Double[1];
					d[0]= 0.0;
					
					barras[0] = new DataSetsBar(colunas[0],cores[0],d);
					GraficoBarra barData = new GraficoBarra();
					barData.setTitulos("Sem Dados");
					barData.setDatasets(barras);
					relatorio.setBarData(barData);		
					
					
					DataSetsPie[] pie = new DataSetsPie[1];
					pie[0] = new DataSetsPie(d);
					pie[0].setBackgroundColor(cores);
					return relatorio;
				}
				
				
				//LABELS DO GRAFICOS
				String[] labels = new String[resultado.length]; 		
				for(int i = 0; i < resultado.length; i ++){
					labels[i] = resultado[i][0].toString();
				}
				
				
					
				
				
				
				//MONTAGEM DOS VALORES DA TABELA
				int linha = 0;
				int coluna =0;
				String[][] valores = new String[resultado.length][resultado[0].length];
				for(Object res[] : resultado){
					coluna = 0;
					for(Object o :res){
						valores[linha][coluna] = o.toString();
						coluna ++;
					}
					linha++;
				}
				
				
				RelatorioDto relatorio = new RelatorioDto();
				relatorio.setColunas(colunas);
				relatorio.setValores(valores);
				
				
				if(grafico){
					//Valores da valores do dados
						DataSetsBar[] barras = new DataSetsBar[resultado[0].length - 1];
						for(int r = 1; r < resultado[0].length; r ++){
							Double[] val = new Double[resultado.length];
							for(int i = 0; i < resultado.length; i ++){
							
								val[i] = Double.parseDouble(resultado[i][r].toString());
							}
							barras[r-1] = new DataSetsBar(colunas[r],cores[r], val);
						}
						
						GraficoBarra barData = new GraficoBarra();
						barData.setTitulos(labels);
						barData.setDatasets(barras);
						relatorio.setBarData(barData);					
					}
					
				
				
				if(grafico){
				//Montar grafico de pizza
					DataSetsPie[] pie = new DataSetsPie[resultado[0].length-1];
					for(int colunasPizza = 1 ; colunasPizza < resultado[0].length; colunasPizza ++){
						Double[] valoresPizza = new Double[resultado.length];
						for(int i = 0; i < resultado.length ; i++){
							valoresPizza[i] = Double.parseDouble(resultado[i][colunasPizza].toString());
						}
						pie[colunasPizza-1] = new DataSetsPie(valoresPizza);
						pie[colunasPizza-1].setBackgroundColor(cores);
					}
					
					GraficoPizza pieData = new GraficoPizza();
					pieData.setLabels(labels);
					pieData.setDatasets(pie);
					relatorio.setPieData(pieData);
					
				}
				
		
				
				
				
				
				
				
				
				
				
				
				return relatorio;
	}

}
