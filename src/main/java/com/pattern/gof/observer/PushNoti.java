package com.pattern.gof.observer;

public class PushNoti implements Observer {
    @Override
    public void handleEvent(Message message) {
        sendPush(message);
    }

    private void sendPush(Message message) {
        System.out.println("푸시알림 전송: " + message.getContent());
    }
}
