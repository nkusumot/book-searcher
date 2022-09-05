package com.example.demo.dao;

import com.example.demo.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BookDaoImpl implements BookDao {

    @Autowired
    RestTemplate restTemplate;

    public static final String URL = "https://www.googleapis.com/books/v1/volumes?q=";

    @Override
    public ApiResponse getBooks(String query) {
        String searchUrl = URL + query;
        return restTemplate.getForObject(searchUrl, ApiResponse.class);
    }

}
