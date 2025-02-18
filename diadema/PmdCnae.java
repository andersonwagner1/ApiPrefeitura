package br.com.prefeitura.diadema.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PMD_CNAE")
public class PmdCnae {
	
	@Id
	private Long cdCnae;
	private String dsCnae;
	public Long getCdCnae() {
		return cdCnae;
	}
	public void setCdCnae(Long cdCnae) {
		this.cdCnae = cdCnae;
	}
	public String getDsCnae() {
		return dsCnae;
	}
	public void setDsCnae(String dsCnae) {
		this.dsCnae = dsCnae;
	}
	
	
	
	
	
	
}
