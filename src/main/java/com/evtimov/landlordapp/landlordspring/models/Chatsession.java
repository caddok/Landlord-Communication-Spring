package com.evtimov.landlordapp.landlordspring.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "chatsessions")
public class Chatsession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChatsessionId")
    private int chatsessionID;

    @Column(name = "Createdate")
    private Date createDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "chatsessionsusers",
            joinColumns = @JoinColumn(name = "ChatsessionId"),
            inverseJoinColumns = @JoinColumn(name = "UserId"))
    private Set<User> users;

    @OneToMany
    @JoinColumn(name = "ChatsessionId")
    private Set<Message> messages;


    public Chatsession(){
        //default
    }

    public Chatsession(int chatsessionID, Date createDate){
        setChatsessionID(chatsessionID);
        setCreateDate(createDate);
    }

    public int getChatsessionID() {
        return chatsessionID;
    }

    public void setChatsessionID(int chatsessionID) {
        this.chatsessionID = chatsessionID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
}
