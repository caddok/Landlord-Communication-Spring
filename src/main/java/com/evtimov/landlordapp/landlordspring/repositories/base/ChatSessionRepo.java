package com.evtimov.landlordapp.landlordspring.repositories.base;

import com.evtimov.landlordapp.landlordspring.models.Chatsession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatSessionRepo extends JpaRepository<Chatsession,Integer> {
}
