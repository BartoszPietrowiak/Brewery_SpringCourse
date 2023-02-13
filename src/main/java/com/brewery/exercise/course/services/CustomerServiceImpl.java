package com.brewery.exercise.course.services;

import com.brewery.exercise.course.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .uuid(customerId)
                .name("Janusz")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto
                .builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo add implementation of update method
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Delete customer with id {}", customerId);
    }
}
