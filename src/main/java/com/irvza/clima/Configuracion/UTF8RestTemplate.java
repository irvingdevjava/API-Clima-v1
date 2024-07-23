package com.irvza.clima.Configuracion;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

public class UTF8RestTemplate {

    public RestTemplate createRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // Interceptor para asegurar que la respuesta sea en UTF-8
        restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                ClientHttpResponse response = execution.execute(request, body);
                response.getHeaders().set(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
                return response;
            }
        });

        return restTemplate;
    }
}

