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
	private final Double VL_SALARIO_MINIMO = 1320.0;
	private DtoJsonDados iassAmbulante;
//	private Integer ANO_REFERENCIA;

	public CalcularRanking(DtoJsonDados iassAmbulante) {
		this.iassAmbulante = iassAmbulante;
	}
	
	
	public int calcularPontuacao() {
		int pontuacao = pontuarAluguel(iassAmbulante.getPagaAluguel()); //2
		pontuacao += pontuarIdade(iassAmbulante.getDataNascimento());//3
		pontuacao += pontuarNecessidadeEspecial(iassAmbulante.getTemNecessidadeEspecial());//4
		pontuacao += pontuarQuantidadePedentende(iassAmbulante.getQuantidadeDependente());//5
		pontuacao += pontuarTempoMoradia(iassAmbulante.geteMoradorDiademaMais2Anos());//6
		pontuacao += pontuarSalarioMinino(iassAmbulante.geteAponsentado(), iassAmbulante.getRendaMensal());
		return pontuacao;
	}
	
	/**							    
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
		pontuacao += pontuarNecessidadeEspecial(iassAmbulante.getTemNecessidadeEspecial()) * 100000000000L;
		pontuacao += pontuarValorAluguel(iassAmbulante.getRendaMensal()) * 10000L;
		pontuacao += calcularIdade(iassAmbulante.getDataNascimento()) * 10;
		pontuacao += pontuarEscolaridade(iassAmbulante.getEscolaridade());
		return pontuacao;
	}
	
	

	private int pontuarIdade(Date data) {
		int idade = calcularIdade(data);

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
			return 4;
		}
		return 0;
	}

	private int pontuarSalarioMinino(EnumSimNao aponsentado,
			Double salario) {
		if (aponsentado == EnumSimNao.NAO) {
			return 0;
		}

		Double qtdSalarioMinino = salario / VL_SALARIO_MINIMO;

		if (qtdSalarioMinino < 1) {
			return -2;
		}

		if (qtdSalarioMinino < 2) {
			return -4;
		}

		if (qtdSalarioMinino < 3) {
			return -6;
		}
		return -10;
	}

	private int pontuarQuantidadePedentende(int qtd) {
		return qtd * 2;
	}

	private int pontuarTempoMoradia(EnumSimNao tempoMoradia) {
		//int idade = calcularIdade(dtMoradia);
		if(tempoMoradia == EnumSimNao.SIM){
			return  2;
		}else{
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
		if (icPagaAluguel == EnumSimNao.NAO) {
			return 0;
		}
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
			return 0;
		}
		int pos = escolaridade.getOrdinal();
		return 9 - pos;
	}

	
	
	

	
	
	public int getPontuacaoAluguel(){
	    return  pontuarAluguel(iassAmbulante.getPagaAluguel());
	}
	
	public int getIdade(){
	    return pontuarIdade(iassAmbulante.getDataNascimento());
	}
	
	public int getNecessidadeEspecial(){
		return pontuarNecessidadeEspecial(iassAmbulante.getTemNecessidadeEspecial());
	}
	
	public int getQuantidadePedentende(){
		return pontuarQuantidadePedentende(iassAmbulante.getQuantidadeDependente());
	}
	
	public int getTempoMoradia(){
	    return pontuarTempoMoradia(iassAmbulante.getTemNecessidadeEspecial());
	}
	
	public int getAponsetado(){
	    return pontuarSalarioMinino(iassAmbulante.geteAponsentado(),iassAmbulante.getRendaMensal());
	}
	
	
	
	

	private void testar() {
		Calendar a = Calendar.getInstance();
		a.set(1984, 11, 1);

		int pontuacao = pontuarAluguel(EnumSimNao.SIM);
		pontuacao += pontuarIdade(a.getTime());
		pontuacao += pontuarNecessidadeEspecial(EnumSimNao.SIM);
		pontuacao += pontuarSalarioMinino(EnumSimNao.NAO, 5.0);
		pontuacao += pontuarQuantidadePedentende(2);
		//pontuacao += pontuarTempoMoradia(a.getTime());
		System.out.println("Pontuacao " + pontuacao);

		Long p = 0l;

		p += 9 * 1000000000000L;
		p += pontuarNecessidadeEspecial(EnumSimNao.SIM) * 100000000000L;
		p += pontuarValorAluguel(12300.01) * 10000;
		p += calcularIdade(a.getTime()) * 10;
		p += pontuarEscolaridade(EnumEscolaridade.ENS_BASICO_COMPL);
		System.out.println("Pontuacao " + p);
	}

	public static void main(String arg[]) {
		new CalcularRanking(null).testar();
	}

	public double salarioMinimo() {
		return VL_SALARIO_MINIMO;
		
	}

}
