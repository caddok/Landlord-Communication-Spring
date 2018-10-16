package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Chatsession;
import org.springframework.data.repository.CrudRepository;

public interface ChatSessionRepo extends CrudRepository<Chatsession,Integer> {
}
