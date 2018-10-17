package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message,Integer> {
}
