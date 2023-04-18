package com.pattern.gof.observer;

public class Mail implements Observer {
    @Override
    public void handleEvent(Message message) {
        sendMail(message);
    }

    private void sendMail(Message message) {
        System.out.println("메일전송 : " + message.getContent());
    }
}
