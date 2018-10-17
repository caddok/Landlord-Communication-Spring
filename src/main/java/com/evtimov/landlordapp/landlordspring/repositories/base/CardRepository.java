package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card,Integer> {
}
