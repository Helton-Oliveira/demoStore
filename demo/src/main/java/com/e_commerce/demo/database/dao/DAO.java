package com.e_commerce.demo.database.dao;

import com.e_commerce.demo.database.models.User;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DAO {
    private final File jsonFile;
    private static final ObjectMapper mapper = new ObjectMapper();
    private String entity;

    public  DAO(String entity) {
        this.entity = entity;
        this.jsonFile = new File(this.entity + ".json");
    }

    public <T> String create(T classData) throws IOException {
        FileWriter writer = new FileWriter(this.jsonFile);
        String jsonString = mapper.writeValueAsString(classData);

        writer.write(jsonString);
        writer.close();

        return "SuccessFully";
    }

    public <T> T get(Class<T> toClass) throws IOException {
        var data = mapper.readValue(jsonFile, toClass);
        return data;
    }
}
