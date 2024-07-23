package com.irvza.clima.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irvza.clima.Service.CallApi;


@RestController
@RequestMapping("/api/v1")
public class Wheater {

    @Autowired
    CallApi callApi;

    @GetMapping("/weather")
    public ResponseEntity<?> getMethodName(@RequestParam String location) {
        return ResponseEntity.ok(callApi.getInfo(location));
    }
    

}
