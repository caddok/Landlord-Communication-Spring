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

    @Column(name = "SenderId")
    private int senderID;

    @Column(name = "RecieverId")
    private int recieverID;

    @Column(name = "Timestamp")
    private Date timestamp;

    @Column(name = "ChatsessionId")
    private int chatsessionID;

    @Column(name = "Text")
    private String text;

    @Column(name = "Picture")
    private String picture;

    @Column(name = "Status")
    private String status;

//    @ManyToOne
//    @JoinColumn(name = "SenderId")
//    private User sender;
//
//    @ManyToOne
//    @JoinColumn(name = "RecieverId")
//    private User reciever;


    public Message(){
        //default
    }

    public Message(int messageID, int senderID, int recieverID, Date timestamp, int chatsessionID, String text,
                   String picture, String status){
        setMessageID(messageID);
        setSenderID(senderID);
        setRecieverID(recieverID);
        setTimestamp(timestamp);
        setChatsessionID(chatsessionID);
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

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getRecieverID() {
        return recieverID;
    }

    public void setRecieverID(int recieverID) {
        this.recieverID = recieverID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getChatsessionID() {
        return chatsessionID;
    }

    public void setChatsessionID(int chatsessionID) {
        this.chatsessionID = chatsessionID;
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
}
