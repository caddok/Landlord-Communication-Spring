package com.evtimov.landlordapp.landlordspring.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MessageId")
    private int messageID;

    @Column(name = "Timestamp")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "ChatsessionId")
    private Chatsession chatsession;

    @Column(name = "Text")
    private String text;

    @Column(name = "Picture")
    private String picture;

    @Column(name = "Status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "SenderId")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "ReceiverId")
    private User receiver;


    public Message(){
        //default
    }

    public Message(int messageID, Date timestamp, String text,
                   String picture, String status){
        setMessageID(messageID);
        setTimestamp(timestamp);
        setText(text);
        setPicture(picture);
        setStatus(status);
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }



    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Chatsession getChatsession() {
        return chatsession;
    }

    public void setChatsession(Chatsession chatsession) {
        this.chatsession = chatsession;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
