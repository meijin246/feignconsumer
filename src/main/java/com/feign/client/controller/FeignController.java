package com.feign.client.controller;

import com.feign.client.entity.Body;
import com.feign.client.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService service;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloConsumer(@RequestParam(value = "data") String data){
        Body body = new Body();
        body.setData(data);
        return service.hello(body);
    }
}
