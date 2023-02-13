package com.brewery.exercise.course.services;

import com.brewery.exercise.course.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Zywiec")
                .beerStyle("Pale Ale")
                .build();
    }
}
