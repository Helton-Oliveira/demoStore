package com.e_commerce.demo.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductDto(@JsonAlias("title") String productName,
                         @JsonAlias("price") Double price,
                         @JsonAlias("category") String category,
                         @JsonAlias("description") String description) {
}
