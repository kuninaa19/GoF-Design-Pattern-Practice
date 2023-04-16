package com.pattern.gof.proxy;

import java.util.Optional;

public class CacheImage implements Image {
    private final RealImage realImage;
    private String path;

    public CacheImage() {
        this.realImage = new RealImage();
    }

    @Override
    public String getPath(String path) throws InterruptedException {
        if (Optional.ofNullable(this.path).isEmpty() || !checkSamePath(path)) {
            this.path = realImage.getPath(path);
        }

        return this.path;
    }

    private boolean checkSamePath(String path) {
        return this.path.equals(path);
    }
}
