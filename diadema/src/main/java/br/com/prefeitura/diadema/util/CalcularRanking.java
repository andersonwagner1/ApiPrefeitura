package br.com.prefeitura.diadema.util;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import br.com.prefeitura.diadema.dto.shopping.DtoJsonDados;
import br.com.prefeitura.diadema.enumerador.EnumEscolaridade;
import br.com.prefeitura.diadema.enumerador.EnumSimNao;

public class CalcularRanking {
	
	private DtoJsonDados iassAmbulante;
	private Double salarioMinimo;


	public CalcularRanking(String iassAmbulante, Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
		this.iassAmbulante = ConverterDtoJson.jsonParaDto(iassAmbulante, DtoJsonDados.class);
	}
	
	public CalcularRanking(DtoJsonDados iassAmbulante, Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
		this.iassAmbulante = iassAmbulante;
	}
	
	
	public int calcularPontuacao() {
		int pontuacao = pontuarAluguel(iassAmbulante.getDsPagaAluguel()); //2
		pontuacao += pontuarIdade(iassAmbulante.getIdade());//3
		pontuacao += pontuarNecessidadeEspecial(iassAmbulante.getDsPortadorNecessidadeEspecial());//4
		pontuacao += pontuarQuantidadePedentende(iassAmbulante.getQuantidadeDependente());//5
		pontuacao += pontuarTempoMoradia(iassAmbulante.getDsMoraMais2AnosEmDiadema());//6
		pontuacao += pontuarSalarioMinino(iassAmbulante.getDsAponsentado(), iassAmbulante.getVlRendaMensal());
		return pontuacao;
	}
	

	/**		
	 * lEMBRANDO QUE DEVE SER UM "DESC" 					    
	 * PontuaÃ§Ã£o para o criterio de desempate 99110000009991 XXABBBBBBBIIIG
	 * 
	 * onde xx = QUANTIDADE DE DEPEDENTES LEGAIS MAX (99 NOS) A = SE TEM
	 * NECESSIDADE ESPECIAL (4 = SIM, 0 = NÃƒO) BBBBBBB = valor do aluguel ATÃ‰ R$
	 * 99.999,99 III = idade atÃ© 999 anos G = 2 ATE 9; grau de escolaridade
	 * 
	 * Exemplo: 4 depentes, nÃ£o tem necessidade especial, valor do alugel 400,88
	 * idade 45 anos, escolaridade fundamental compelto o resuldado do criterio
	 * de desempate serÃ¡ 4400400880455 pontos no score
	 * 
	 * @return 
	 */
	public Long calcularPontuacaoCriterioParaDesempate() {
		Long pontuacao = 0L;

		pontuacao += iassAmbulante.getQuantidadeDependente() * 1000000000000L;
		pontuacao += pontuarNecessidadeEspecial(iassAmbulante.getDsPortadorNecessidadeEspecial()) * 100000000000L;
		pontuacao += pontuarValorAluguel(iassAmbulante.getVlAlguel()) * 10000L;
		pontuacao += iassAmbulante.getIdade() * 10;
		pontuacao += pontuarEscolaridade(iassAmbulante.getDsEscolaridade());
		return pontuacao;
	}
	
	private int pontuarIdade(int idade) {
	//	System.out.print("-" + idade);
		if (idade >= 60) {
			
			return 4;
		}
		if (idade >= 50) {
			
			return 3;
		}
		if (idade >= 40) {
			
			return 2;
		}
		if (idade >= 30) {
			
			return 1;
		}
		
		return 0;
	}
	
	
	@Deprecated
	private int pontuarIdade(Date data) {
		int idade = calcularIdade(data);

		if (idade >= 60) {
		//	System.out.println("IdadE: 4");
			return 4;
		}
		if (idade >= 50) {
		//	System.out.println("IdadE: 3");
			return 3;
		}
		if (idade >= 40) {
		//	System.out.println("IdadE: 2");
			return 2;
		}
		if (idade >= 30) {
			//System.out.println("IdadE: 1");
			return 1;
		}
		//System.out.println("IdadE: 0");
		return 0;
	}

	
	
	@Deprecated
	private int calcularIdade(Date dataNascimentoDate) {
		Date dataAtualDate = new Date(); 
		
        if (dataNascimentoDate == null || dataAtualDate == null) {
            return 0;
        }
        
        // Converte java.util.Date para LocalDate
        LocalDate dataNascimento = dataNascimentoDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        
        LocalDate dataAtual = dataAtualDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        
        // Calcula a idade
        return Period.between(dataNascimento, dataAtual).getYears();
    }
	
	
	

	private int pontuarNecessidadeEspecial(EnumSimNao portador) {
		if (portador == EnumSimNao.SIM) {
			//System.out.println("PNE: 4");
			return 4;
		}
		//System.out.println("PNE: 0");
		return 0;
	}

	private int pontuarSalarioMinino(EnumSimNao aponsentado,
			Double salario) {
		if (aponsentado == EnumSimNao.NAO) {
		//	System.out.println("qtdSalarioMinino: 0" );
			return 0;
		}

		Double qtdSalarioMinino = salario / salarioMinimo;

		if (qtdSalarioMinino < 1) {
		//	System.out.println("qtdSalarioMinino: -2" );
			return -2;
		}

		if (qtdSalarioMinino < 2) {
		//	System.out.println("qtdSalarioMinino: -4" );
			return -4;
		}

		if (qtdSalarioMinino < 3) {
		//	System.out.println("qtdSalarioMinino: -6" );
			return -6;
		}
		return -10;
	}

	private int pontuarQuantidadePedentende(int qtd) {
	//	System.out.println("Depedente: " + (qtd * 2));
		return qtd * 2;
	}

	private int pontuarTempoMoradia(EnumSimNao tempoMoradia) {
		//int idade = calcularIdade(dtMoradia);
		if(tempoMoradia == EnumSimNao.SIM){
	//		System.out.println("tempoMoradia: 2");
			return  2;
		}else{
	//		System.out.println("tempoMoradia: 0");
			return 0;
		}
	}

	// para calcular o valor do aluguel serÃ¡ necessario conveter double para
	// int, colocando as casas decimais para frente para isso serÃ¡ necessario
	// multiplicar por 10
	private Long pontuarValorAluguel(Double vlAluguel) {
		if (vlAluguel == null) {
			return 0L;
		}
		BigDecimal b = new BigDecimal(vlAluguel);
		b = b.multiply(new BigDecimal(100.000000));
		
		String valor = String.valueOf(b.intValue());
		return Long.parseLong(valor);
	}

	private int pontuarAluguel(EnumSimNao icPagaAluguel) {
	//	System.out.println(icPagaAluguel);
		if (icPagaAluguel == EnumSimNao.NAO) {
			
			return 0;
		}
	//	System.out.println("Aluguel: 4");
		return 4;
	}

	/**
	 * Pontuar a escolidade do ambulante quando menor a escolaridade maior Ã© a
	 * pontuaÃ§Ã£o ou seja como a escolaridade menor Ã© 0 e a maior Ã© 7, foi
	 * colocado o numero 9 para ser descrescido ou seja se a escolaridade for
	 * baixa entÃ£o serÃ¡ 9 - 0 = 9 e se for alta 9 - 7 = 2 assim que sera
	 * definido a pontuaÃ§Ã£o por criterio de desempate
	 * 
	 * @param escolaridade
	 * @return
	 */
	private int pontuarEscolaridade(EnumEscolaridade escolaridade) {
		if (escolaridade == null) {
			//System.out.println("escolaridade: 0");
			return 0;
		}
		int pos = escolaridade.getOrdinal();
	//	System.out.println("escolaridade: " + (9 - pos));
		return 9 - pos;
	}

	
	
	public static void main(String arg[]){
		new CalcularRanking();
	}

	public CalcularRanking() {
		usuario("PMDI 00027531/2024",	37,	EnumSimNao.SIM,	1100.0,	EnumEscolaridade.EMC,		3);
		usuario("PMDI 00028224/2024",	52,	EnumSimNao.SIM,	800.0,	EnumEscolaridade.EMC,		1);
		usuario("PMDI 00028227/2024	",	50,	EnumSimNao.SIM,	800.0,	EnumEscolaridade.EMC,		1);
		usuario("PMDI 00027471/2024",	28,	EnumSimNao.SIM,	1150.0,	EnumEscolaridade.EMI,		2);
		usuario("PMDI 00027530/2024",	32,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		2);
		usuario("PMDI 00028223/2024",	30,	EnumSimNao.SIM,	500.0,	EnumEscolaridade.ESC,		0);
		usuario("PMDI 00026748/2024",	25,	EnumSimNao.SIM,	770.0,	EnumEscolaridade.EMC,		0);
		usuario("PMDI 00027106/2024",	21,	EnumSimNao.SIM,	450.0,	EnumEscolaridade.EMC,		0);
		usuario("PMDI 00028174/2024",	62,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		0);
		usuario("PMDI 00028748/2024",	59,	EnumSimNao.SIM,	.0,		EnumEscolaridade.ESI,		0);
		usuario("PMDI 00027561/2024",	57,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EFI,		1);
		usuario("PMDI 00028067/2024",	55,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		0);
		usuario("PMDI 00027689/2024",	54,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EBI,		0);
		usuario("PMDI 00028124/2024",	54,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		0);
		usuario("PMDI 00027726/2024",	52,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EBI,		0);
		usuario("PMDI 00027355/2024",	38,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMI,		1);
		usuario("PMDI 00027399/2024",	38,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		0);
		usuario("PMDI 00026833/2024",	34,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		0);
		usuario("PMDI 00027145/2024",	29,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		1);
		usuario("PMDI 00028099/2024",	24,	EnumSimNao.SIM,	.0,		EnumEscolaridade.EMC,		2);
	}
	
	private void usuario(String nome, int idade, EnumSimNao morador, double valorAlguel, EnumEscolaridade escolaridade, int depentende){
		iassAmbulante = new DtoJsonDados();
		
		iassAmbulante.setDsMoraMais2AnosEmDiadema(morador);
		if(valorAlguel > 0){
			iassAmbulante.setDsPagaAluguel(EnumSimNao.SIM);
		}else{
			iassAmbulante.setDsPagaAluguel(EnumSimNao.NAO);
		}
		
		iassAmbulante.setIdade(idade);
		iassAmbulante.setQuantidadeDependente(depentende);
				
		iassAmbulante.setVlRendaMensal(0.0);
		iassAmbulante.setDsAponsentado(EnumSimNao.NAO);
		
		iassAmbulante.setVlAlguel(valorAlguel);
		iassAmbulante.setDsEscolaridade(escolaridade);
		
		System.out.print("nome: " + nome);
		System.out.print(" pontuacao:" + calcularPontuacao());
		System.out.println(" criterio: " + calcularPontuacaoCriterioParaDesempate());
		
		
	}
	
	

	 void testar() {
		Calendar a = Calendar.getInstance();
		a.set(1984, 11, 1);

		int pontuacao = pontuarAluguel(EnumSimNao.SIM);
		pontuacao += pontuarIdade(a.getTime());
		pontuacao += pontuarNecessidadeEspecial(EnumSimNao.NAO);
		pontuacao += pontuarSalarioMinino(EnumSimNao.NAO, 5.0);
		pontuacao += pontuarQuantidadePedentende(2);
		//pontuacao += pontuarTempoMoradia(a.getTime());
		//System.out.println("Pontuacao " + pontuacao);

		Long p = 0L;

		p += 9 * 1000000000000L;
		p += pontuarNecessidadeEspecial(EnumSimNao.NAO) * 100000000000L;
		p += pontuarValorAluguel(12300.01) * 10000;
		p += calcularIdade(a.getTime()) * 10;
		p += pontuarEscolaridade(EnumEscolaridade.EBC);
		//System.out.println("Pontuacao " + p);
	}

	

	

}
