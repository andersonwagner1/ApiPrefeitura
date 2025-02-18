package br.com.prefeitura.diadema.dto;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToListPublicidadeConverter implements Converter<String, List<Publicidades>> {

    @Override
    public List<Publicidades> convert(String source) {
        if (source == null || source.trim().isEmpty()) {
            return new ArrayList<>(); // Retorna uma lista vazia
        }

        // Aqui você pode adicionar a lógica para converter a string em uma lista de Publicidade
        // Se for necessário, você pode parsear a string e adicionar elementos à lista

        return new ArrayList<>(); // Ajuste conforme necessário
    }
}