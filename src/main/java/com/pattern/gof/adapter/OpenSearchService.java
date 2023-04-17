package com.pattern.gof.adapter;

public class OpenSearchService {
    public String[] query(OpenServiceQuery query) {
        System.out.println("외부 데이터 조회 API 사용");
        System.out.println("검색어 : " + query.getQuery());

        return new String[]{"외부", "데이터", "조회", "결과"};
    }
}
