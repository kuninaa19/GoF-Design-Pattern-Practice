package com.pattern.gof.facade;

public class CinemaFacade {

    private final Movie movie;
    private final Ad ad;
    private final Light light;

    public CinemaFacade() {
        movie = new Movie();
        ad = new Ad();
        light = new Light();
    }

    public void startAd() {
        System.out.println("---- 광고 타임 시작 ----");
        light.turnOff();
        ad.turnOn();
        System.out.println("");
    }

    public void startMovie() {
        System.out.println("---- 영화 시작 ----");
        ad.turnOff();
        movie.turnOn();
        System.out.println();
    }

    public void endMovie() {
        System.out.println("---- 영화 끝 ----");
        movie.turnOff();
        light.turnOn();
    }
}
