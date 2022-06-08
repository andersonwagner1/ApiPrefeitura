package br.com.prefeitura.diadema.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.exception.ApiParamentrosException;
import br.com.prefeitura.diadema.exception.ApiRuleException;

@RestController
@RequestMapping(path = "custom-exception-example")
public class ExampleExceptionController {
    @PostMapping(path = "validation")
    public ResponseEntity<UsuarioDto> exampleModelValidationEndpoint(@Validated @RequestBody UsuarioDto dto) {
        return ResponseEntity.ok(dto);
    }

    @PostMapping(path = "business")
    public ResponseEntity<String> exampleBusinessValidationEndpoint(@Validated @RequestBody UsuarioDto dto) throws ApiParamentrosException, ApiRuleException {
        if (dto.getNome().equalsIgnoreCase("params")) {
            throw new ApiParamentrosException("params");
        }

        if (!dto.getNome().equalsIgnoreCase("business")) {
            throw new ApiRuleException();
        }
        return ResponseEntity.ok("Success!");
    }
}