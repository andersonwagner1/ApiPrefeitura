package br.com.prefeitura.diadema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiParamentrosException  extends BaseRuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String KEY = "example.name.rule.with.params";

    public ApiParamentrosException(String value) {
        super(value);
    }

    @Override
    public String getExceptionKey() {
        return KEY;
    }
}

