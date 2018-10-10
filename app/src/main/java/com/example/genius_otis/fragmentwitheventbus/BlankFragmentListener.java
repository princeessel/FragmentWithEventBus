package com.example.genius_otis.fragmentwitheventbus;


public class BlankFragmentListener {

    private final String message;
    private final int messageID;

    public BlankFragmentListener(String message, int messageID) {
        this.message = message;
        this.messageID = messageID;
    }

    public String getMessage() {
        return message;
    }

    public int getMessageID() {
        return messageID;
    }
}