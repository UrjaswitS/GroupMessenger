package com.google.firebase.udacity.friendlychat;

/**
 * Created by UrJasWitK on 07-Apr-17.
 */

public class Profile {

    private String email;
    private String name;
    private String photoUrl;
    private FriendlyMessage messages[];

    public Profile() {
    }

    public Profile(String email, String name, String photoUrl, FriendlyMessage messages[]) {
        this.email = email;
        this.name = name;
        this.photoUrl = photoUrl;
        this.messages = messages;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public FriendlyMessage[] getMessages() {
        return messages;
    }

    public void setMessages(FriendlyMessage[] messages) {
        this.messages = messages;
    }
}
