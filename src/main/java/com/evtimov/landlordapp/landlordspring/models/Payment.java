package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentId")
    private int paymentID;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;


    @ManyToOne
    @JoinColumn(name = "CardId")
    private Card card;


    @ManyToOne
    @JoinColumn(name = "PlaceId")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "RentId")
    private Rent rent;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Date")
    private Date date;

    public Payment(){
        //default
    }

    public Payment(int paymentID, double amount, Date date){
        setPaymentID(paymentID);
        setAmount(amount);
        setDate(date);
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
