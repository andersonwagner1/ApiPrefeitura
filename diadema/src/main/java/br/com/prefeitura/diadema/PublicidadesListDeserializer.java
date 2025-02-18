package br.com.prefeitura.diadema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.dto.Publicidades;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class PublicidadesListDeserializer extends JsonDeserializer<List<Publicidades>> {

    @Override
    public List<Publicidades> deserialize(JsonParser p, DeserializationContext ctxt) 
        throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        if (node.isArray()) {
            List<Publicidades> list = new ArrayList<>();
            for (JsonNode element : node) {
                Publicidades publicidade = p.getCodec().treeToValue(element, Publicidades.class);
                list.add(publicidade);
            }
            return list;
        } else if (node.isMissingNode() || node.isNull() || node.asText().isEmpty()) {
            return new ArrayList<>();
        }
        throw new IOException("Unexpected JSON format for List<Publicidades>");
    }
}
