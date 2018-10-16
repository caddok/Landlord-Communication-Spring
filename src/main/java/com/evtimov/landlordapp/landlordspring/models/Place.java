package com.evtimov.landlordapp.landlordspring.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "places")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlaceId")
    private int placeID;

    @Column(name = "Address")
    private String address;

    @Column(name = "Description")
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usersplaces",
            joinColumns = @JoinColumn(name = "PlaceID"),
            inverseJoinColumns = @JoinColumn(name = "UserID"))
    private Set<User> users;

    @OneToMany
    @JoinColumn(name = "PlaceId")
    private Set<Report> reports;

    public Place(){
        //default
    }

    public Place(int placeID, String address, String description){
        setPlaceID(placeID);
        setAddress(address);
        setDescription(description);
    }


    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Report> getReports() {
        return reports;
    }

    public void setReports(Set<Report> reports) {
        this.reports = reports;
    }
}
