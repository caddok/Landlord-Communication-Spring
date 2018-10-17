package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Payment;
import com.evtimov.landlordapp.landlordspring.repositories.base.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository repository;

    @Autowired
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public void payYourBill(Payment payment) {

    }

    public List<Payment> getAllPaymentsByUserId(int id){
        return null;
    }



}
