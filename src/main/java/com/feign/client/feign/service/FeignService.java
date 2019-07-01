package com.feign.client.feign.service;

import com.feign.client.entity.Body;
import com.feign.client.feign.service.impl.FeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@Component
@FeignClient(value = "provider", fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping("/hello")
    String hello(@RequestBody Body body);

}
