package com.nishant.firealaram.utility;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class JsonFormatter {

    public static <T> String getJsonObjectAsString(T data) {
        ObjectMapper mapper = new ObjectMapper();
        String dataString = "";
        try {
            StringWriter sw = new StringWriter();
            dataString = mapper.writeValueAsString(data);
        } catch (IOException e) {
        }
        return dataString;
    }
}
