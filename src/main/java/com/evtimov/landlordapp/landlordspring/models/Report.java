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

    @ManyToOne
    @JoinColumn(name = "PlaceId")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;

    public Report(){
        //default
    }

    public Report(int reportID, String issue, String description, String picture, Date date, boolean isResolved){
        setReportID(reportID);
        setIssue(issue);
        setDescription(description);
        setPicture(picture);
        setDate(date);
        setIsResolved(isResolved);
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
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
        return this.isResolved;
    }

    public void setIsResolved(boolean isResolved) {
        this.isResolved = isResolved;
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
