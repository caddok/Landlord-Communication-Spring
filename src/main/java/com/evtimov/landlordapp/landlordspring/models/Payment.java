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

    @Column(name = "UserId")
    private int userID;

    @Column(name = "CardId")
    private int cardID;

    @Column(name = "PlaceId")
    private int placeID;

    @Column(name = "RentId")
    private int rentID;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Date")
    private Date date;

    public Payment(){
        //default
    }

    public Payment(int paymentID, int userID, int cardID, int placeID, int rentID, double amount, Date date){
        setPaymentID(paymentID);
        setUserID(userID);
        setCardID(cardID);
        setPlaceID(placeID);
        setRentID(rentID);
        setAmount(amount);
        setDate(date);
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
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
}
