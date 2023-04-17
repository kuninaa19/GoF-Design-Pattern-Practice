package com.pattern.gof.adapter;

import java.util.List;

public class SearchService implements InternalService {
    @Override
    public List<String> search(String keyword) {
        System.out.println("내부 데이터 조회 API 사용");
        System.out.println("검색어 : " + keyword);

        return List.of("내부", "데이터", "조회","결과");
    }
}
