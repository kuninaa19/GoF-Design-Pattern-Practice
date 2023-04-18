package com.pattern.gof.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer mail = new Mail();
        Observer pushNoti = new PushNoti();

        subject.add(mail);
        subject.add(pushNoti);

        subject.notifyObservers(new Message("테스트메시지~"));
    }
}
