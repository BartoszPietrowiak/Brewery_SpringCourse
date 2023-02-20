package com.brewery.exercise.course.web.mappers;

import com.brewery.exercise.course.domain.Beer;
import com.brewery.exercise.course.domain.Beer.BeerBuilder;
import com.brewery.exercise.course.web.model.BeerDto;
import com.brewery.exercise.course.web.model.BeerDto.BeerDtoBuilder;
import com.brewery.exercise.course.web.model.v2.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-20T09:12:26+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
@Component
public class BeerMappersImpl implements BeerMappers {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( beer.getBeerStyle().name() );
        }
        beerDto.upc( beer.getUpc() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beer) {
        if ( beer == null ) {
            return null;
        }

        BeerBuilder beer1 = Beer.builder();

        beer1.id( beer.getId() );
        beer1.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beer1.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        beer1.upc( beer.getUpc() );
        beer1.lastUpdatedDate( dateMapper.asTimestamp( beer.getLastUpdatedDate() ) );
        beer1.createdDate( dateMapper.asTimestamp( beer.getCreatedDate() ) );

        return beer1.build();
    }
}
