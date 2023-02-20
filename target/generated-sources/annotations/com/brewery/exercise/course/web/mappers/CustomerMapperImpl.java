package com.brewery.exercise.course.web.mappers;

import com.brewery.exercise.course.domain.Customer;
import com.brewery.exercise.course.domain.Customer.CustomerBuilder;
import com.brewery.exercise.course.web.model.CustomerDto;
import com.brewery.exercise.course.web.model.CustomerDto.CustomerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-20T09:12:26+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerToCustomerDto(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.uuid( customerDto.getUuid() );
        customer.name( customerDto.getName() );

        return customer.build();
    }

    @Override
    public CustomerDto customerDtoToCustomer(Customer customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto1 = CustomerDto.builder();

        customerDto1.uuid( customerDto.getUuid() );
        customerDto1.name( customerDto.getName() );

        return customerDto1.build();
    }
}
