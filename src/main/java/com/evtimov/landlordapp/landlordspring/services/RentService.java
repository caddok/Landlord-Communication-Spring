package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Rent;
import com.evtimov.landlordapp.landlordspring.repositories.base.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService {
    private final RentRepository repository;

    @Autowired
    public RentService(RentRepository repository) {
        this.repository = repository;
    }

    public void addRent(Rent rent) {
        repository.save(rent);
    }

    public void updateRent(Rent rent) {
        repository.save(rent);
    }

}
