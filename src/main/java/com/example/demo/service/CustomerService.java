package com.example.demo.service;

import com.example.demo.client.CustomerClient;
import com.example.demo.dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * @author rafael.braga
 * @version 1.0 01/03/2021
 */
@Service
public class CustomerService {

    private final CustomerClient customerClient;

    public CustomerService(final CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    public CustomerDto getById(String id) {
        return customerClient.getById(id);
    }

}
