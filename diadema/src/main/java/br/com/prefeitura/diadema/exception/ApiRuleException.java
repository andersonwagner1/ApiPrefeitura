package br.com.prefeitura.diadema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiRuleException extends BaseRuntimeException {
    private static final String KEY = "example.name.rule";

    public ApiRuleException() {
        super();
    }

    @Override
    public String getExceptionKey() {
        return KEY;
    }
}