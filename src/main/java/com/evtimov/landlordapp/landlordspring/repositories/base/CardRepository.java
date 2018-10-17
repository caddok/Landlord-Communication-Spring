package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card,Integer> {
}
