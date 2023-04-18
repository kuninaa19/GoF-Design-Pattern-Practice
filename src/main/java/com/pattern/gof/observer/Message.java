package com.pattern.gof.observer;

public class Message {

    private final String content;

    public Message(String s) {
        this.content = s;
    }

    public String getContent() {
        return content;
    }
}
