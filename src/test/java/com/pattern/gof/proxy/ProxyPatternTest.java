package com.pattern.gof.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyPatternTest {
    @Test
    @DisplayName("이미지 조회 0.5초 소요")
    void 실제_이미지_조회() throws InterruptedException {
        Image image = new RealImage();

        assertThat(image.getPath("test.png")).isEqualTo("test.png");
    }

    @Test
    @DisplayName("캐시 테스트 1회")
    void 캐시_이미지_조회() throws InterruptedException {
        Image image = new CacheImage();

        assertThat(image.getPath("test.png")).isEqualTo("test.png");
        assertThat(image.getPath("test.png")).isEqualTo("test.png");
    }
}
