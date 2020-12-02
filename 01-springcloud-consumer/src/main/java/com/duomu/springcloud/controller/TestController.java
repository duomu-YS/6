package com.duomu.springcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8081/test",String.class);
        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getHeaders());
        return "myFirst的消费者springCloud!!!!------------"+responseEntity.getBody();
    }
}
