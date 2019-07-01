package com.feign.client.feign.service.impl;

import com.feign.client.entity.Body;
import com.feign.client.feign.service.FeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/fallback")
public class FeignServiceImpl implements FeignService {

    @Override
    public String hello(Body body){
        return "request time out " + body.toString();
    }
}
