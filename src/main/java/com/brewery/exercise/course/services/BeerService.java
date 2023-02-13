package com.brewery.exercise.course.services;

import com.brewery.exercise.course.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
