package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userID;

    @Column(name = "IsLandlord")
    private boolean isLandlord;

    @Column(name = "Username")
    private String username;

    @Column(name = "Picture")
    private String picture;

    @Column(name = "Firstname")
    private String firstName;

    @Column(name = "Lastname")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Isonline")
    private boolean isOnline;

    @Column(name = "Rating")
    private double rating;

    @Column(name = "Passwordhash")
    private String passwordHash;

    @Column(name = "Passwordsalt")
    private String passwordSalt;

    @Column(name = "Votes")
    private int votes;

    @Column(name = "Votesum")
    private double voteSum;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usersplaces",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "PlaceID"))
    private Set<Place> myPlaces;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "mchatsessionsusers",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "ChatsessionID"))
    private Set<Chatsession> myChats;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<Card> myCards;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<Report> myReports;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<Payment> myPayments;

    @OneToMany
    @JoinColumn(name = "SenderId")
    private Set<Message> sentMessages;

    @OneToMany
    @JoinColumn(name = "ReceiverId")
    private Set<Message> receivedMessages;


    public User(){
        //default
    }

    public User(int userID, boolean isLandlord, String username, String picture, String firstName, String lastName, String email,
                boolean isOnline, String passwordHash, String passwordSalt, int votes, double voteSum){
        setUserID(userID);
        setIsLandlord(isLandlord);
        setUsername(username);
        setPicture(picture);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setIsOnline(isOnline);
        setPasswordHash(passwordHash);
        setPasswordSalt(passwordSalt);
        setVotes(votes);
        setVoteSum(voteSum);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean getIsLandlord() {
        return this.isLandlord;
    }

    public void setIsLandlord(boolean isLandlord) {
        this.isLandlord = isLandlord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public double getVoteSum() {
        return voteSum;
    }

    public void setVoteSum(double voteSum) {
        this.voteSum = voteSum;
    }

    public Set<Place> getMyPlaces() {
        return myPlaces;
    }

    public void setMyPlaces(Set<Place> myPlaces) {
        this.myPlaces = myPlaces;
    }

    public Set<Chatsession> getMyChats() {
        return myChats;
    }

    public void setMyChats(Set<Chatsession> myChats) {
        this.myChats = myChats;
    }

    public Set<Card> getMyCards() {
        return myCards;
    }

    public void setMyCards(Set<Card> myCards) {
        this.myCards = myCards;
    }

    public Set<Report> getMyReports() {
        return myReports;
    }

    public void setMyReports(Set<Report> myReports) {
        this.myReports = myReports;
    }

    public Set<Payment> getMyPayments() {
        return myPayments;
    }

    public void setMyPayments(Set<Payment> myPayments) {
        this.myPayments = myPayments;
    }

    public Set<Message> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(Set<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public Set<Message> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(Set<Message> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }
}
