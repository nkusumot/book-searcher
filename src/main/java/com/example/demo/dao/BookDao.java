package com.example.demo.dao;

import com.example.demo.model.ApiResponse;

public interface BookDao {
    ApiResponse getBooks(String query);
}
