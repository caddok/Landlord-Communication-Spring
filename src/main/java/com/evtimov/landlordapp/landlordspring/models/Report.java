package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReportId")
    private int reportID;

    @Column(name = "PlaceId")
    private int placeID;

    @Column(name = "Issue")
    private String issue;

    @Column(name = "Description")
    private String description;

    @Column(name = "Picture")
    private String picture;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Isresolved")
    private boolean isResolved;

    @Column(name = "UserId")
    private int userID;

    @ManyToOne
    @JoinColumn(name = "PlaceId")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    public Report(){
        //default
    }

    public Report(int reportID, int placeID, String issue, String description, String picture, Date date, boolean isResolved,
                  int userID, Place place, User user){
        setPlace(place);
        setUser(user);
        setReportID(reportID);
        setPlaceID(placeID);
        setIssue(issue);
        setDescription(description);
        setPicture(picture);
        setDate(date);
        setIsResolved(isResolved);
        setUserID(userID);
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getIsResolved() {
        return isResolved;
    }

    public void setIsResolved(boolean isResolved) {
        isResolved = isResolved;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
