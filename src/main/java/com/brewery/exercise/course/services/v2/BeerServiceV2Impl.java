package com.brewery.exercise.course.services.v2;

import com.brewery.exercise.course.web.model.BeerDto;
import com.brewery.exercise.course.web.model.v2.BeerDtoV2;
import com.brewery.exercise.course.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beerName("Zywiec")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("Update beer with id {}", beerId);
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting beer with id {}", beerId);
    }
}
