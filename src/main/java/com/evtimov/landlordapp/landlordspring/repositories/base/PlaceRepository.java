package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Place;
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Place,Integer> {
}
