package com.example.demo.client;

import com.example.demo.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient
public interface CustomerClient {

    @GetMapping
    CustomerDto getById(@PathVariable("id") String id);

}
