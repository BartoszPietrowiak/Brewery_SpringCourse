package com.brewery.exercise.course.services;

import com.brewery.exercise.course.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .uuid(customerId)
                .name("Janusz")
                .build();
    }
}
