package com.brewery.exercise.course.web.mappers;

import com.brewery.exercise.course.domain.Beer;
import com.brewery.exercise.course.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses={DateMapper.class})
public interface BeerMappers {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beer);
}
