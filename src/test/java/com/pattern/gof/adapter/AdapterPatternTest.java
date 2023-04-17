package com.pattern.gof.adapter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterPatternTest {
    @Test
    void 내부_검색() {
        InternalService service = new SearchService();

        assertThat(service.search("테스트")).isEqualTo(List.of("내부", "데이터", "조회", "결과"));
    }

    @Test
    void 어댑터_외부_검색() {
        InternalService service = new OpenSearchServiceAdapter();

        assertThat(service.search("외부테스트")).isEqualTo(List.of("외부", "데이터", "조회", "결과"));
    }

    @Test
    void 어댑티_외부_검색() {
        OpenSearchService service = new OpenSearchService();

        assertThat(service.query(new OpenServiceQuery("외부테스트"))).isEqualTo(new String[]{"외부","데이터","조회","결과"});
    }
}
