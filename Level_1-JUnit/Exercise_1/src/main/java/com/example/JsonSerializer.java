package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String serialize(Object object) throws Exception {
        Class<?> objClass = object.getClass();
        if (objClass.isAnnotationPresent(SerialiseJSON.class)) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } else {
            throw new Exception("The class " + objClass.getSimpleName() + " is not annotated with @SerialiseJSON");
        }
    }
}
