package br.com.prefeitura.diadema.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ApiErrorDTO {
    private Date timestamp;
    private Integer status;
    private String code;
    private List<ErrorDTO> errors;

    public ApiErrorDTO() {
    }

    public ApiErrorDTO(Date timestamp, Integer status, String code, List<ErrorDTO> errors) {
        this.timestamp = timestamp;
        this.status = status;
        this.code = code;
        this.errors = errors;
    }

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ErrorDTO> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorDTO> errors) {
		this.errors = errors;
	}

   
}