package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//TODO: Come back here when chat is implemented

@Repository
public interface MessageRepo extends CrudRepository<Message,Integer> {
}
