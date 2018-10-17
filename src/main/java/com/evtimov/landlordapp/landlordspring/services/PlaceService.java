package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Place;
import com.evtimov.landlordapp.landlordspring.repositories.base.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
    private final PlaceRepository repository;

    @Autowired
    public PlaceService(PlaceRepository repository) {
        this.repository = repository;
    }

    public void addPlacToLive(Place place) {

    }

    public void deletePlaceById(int id) {

    }

    public void getAllByUserId(int id) {

    }


}
