package com.pattern.gof.adapter;

import java.util.Arrays;
import java.util.List;

public class OpenSearchServiceAdapter implements InternalService {


    private final OpenSearchService openSearchService;

    public OpenSearchServiceAdapter() {
        openSearchService = new OpenSearchService();
    }

    @Override
    public List<String> search(String keyword) {
        OpenServiceQuery query = new OpenServiceQuery(keyword);
        String[] openServiceResult = openSearchService.query(query);

        return convertToResponse(openServiceResult);
    }

    private List<String> convertToResponse(String[] openServiceResult) {
        return Arrays.asList(openServiceResult);
    }
}
