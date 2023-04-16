package com.pattern.gof.proxy;

public class RealImage implements Image {

    @Override
    public String getPath(String path) throws InterruptedException {
        Thread.sleep(500);
        return path;
    }
}
