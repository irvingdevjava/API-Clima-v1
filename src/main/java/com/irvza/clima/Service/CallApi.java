package com.irvza.clima.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CallApi {

    public JsonNode getInfo(String country) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://api.weatherapi.com/v1/current.json?key=&q=" + country + "&aqi=no&lang=es";
            String response = restTemplate.getForObject(url, String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(response);
        } catch (Exception e) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.createObjectNode().put("error", "Error al obtener información del clima. " + e.getMessage());
        }}

}



