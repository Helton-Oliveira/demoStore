package com.e_commerce.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class GetData  {
    private static ObjectMapper mapper = new ObjectMapper();

    public static List transformsData(String json, Class toClass){
        CollectionType list = mapper.getTypeFactory()
                .constructCollectionType(List.class, toClass);
        try {
            return mapper.readValue(json, list);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
