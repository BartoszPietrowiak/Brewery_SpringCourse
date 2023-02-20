package com.brewery.exercise.course.web.mappers;

import com.brewery.exercise.course.domain.Customer;
import com.brewery.exercise.course.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerToCustomerDto(CustomerDto customerDto);

    CustomerDto customerDtoToCustomer(Customer customerDto);
}
