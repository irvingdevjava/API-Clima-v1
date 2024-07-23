package com.irvza.clima.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.irvza.clima.Configuracion.UTF8RestTemplate;
import com.irvza.clima.Modelos.WeatherResponse;

@Service
public class CallApi {
    private final String apiKey = "";
    private final String weatherUrl = "http://api.weatherapi.com/v1/current.json?key={apiKey}&q={location}&lang=es";
    public WeatherResponse getInfo(String location) {
       
        try {
            RestTemplate restTemplate = new UTF8RestTemplate().createRestTemplate();
            return restTemplate.getForObject(weatherUrl, WeatherResponse.class, apiKey, location);
        } catch (Exception e) {
            System.out.println("Error al obtener información del clima. " + e.getMessage());
            return null;
        }
    }

}




