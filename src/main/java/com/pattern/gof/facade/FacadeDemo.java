package com.pattern.gof.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();

        cinemaFacade.startAd();
        cinemaFacade.startMovie();
        cinemaFacade.endMovie();
    }
}
