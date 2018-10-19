package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Place;
import com.evtimov.landlordapp.landlordspring.repositories.base.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlaceService {
    private final PlaceRepository repository;

    @Autowired
    public PlaceService(PlaceRepository repository) {
        this.repository = repository;
    }

    public void addPlacToLive(Place place) {
        repository.save(place);
    }

    public void deletePlaceById(Place place) {
        repository.delete(place);
    }

    public List<Place> getAllByUserId(int id) {
        List<Place> allPlaces = (List<Place>) repository.findAll();
        return allPlaces.stream()
                .filter(place -> place.getUsers().contains(id))
                .collect(Collectors.toList());
    }
}
