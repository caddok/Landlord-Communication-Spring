package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "PlaceId")
    private int placeId;

    @Column(name = "IsPaid")
    private boolean isPaid;

    @Column(name = "Duedate")
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "PlaceId")
    private Place place;

    public Rent(){
        //default
    }

    public Rent(int rentID, double totalAmount, double remaining, int placeId, boolean isPaid, Date dueDate, Place place){
        setPlace(place);
        setRentID(rentID);
        setTotalAmount(totalAmount);
        setRemaining(remaining);
        setPlaceId(placeId);
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

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        isPaid = isPaid;
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
}
