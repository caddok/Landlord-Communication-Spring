package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "rents")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RentId")
    private int rentID;

    @Column(name = "Totalamount")
    private double totalAmount;

    @Column(name = "Remaining")
    private double remaining;

    @Column(name = "IsPaid")
    private boolean isPaid;

    @Column(name = "Duedate")
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "PlaceId")
    private Place place;

    @OneToMany
    @JoinColumn(name = "RentId")
    private Set<Payment> payments;

    public Rent(){
        //default
    }

    public Rent(int rentID, double totalAmount, double remaining, boolean isPaid, Date dueDate){
        setRentID(rentID);
        setTotalAmount(totalAmount);
        setRemaining(remaining);
        setIsPaid(isPaid);
        setDueDate(dueDate);
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    public boolean getIsPaid() {
        return this.isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}
