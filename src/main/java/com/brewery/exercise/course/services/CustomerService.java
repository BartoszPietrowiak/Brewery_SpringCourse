package com.brewery.exercise.course.services;

import com.brewery.exercise.course.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
