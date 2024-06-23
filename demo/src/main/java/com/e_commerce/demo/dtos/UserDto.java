package com.e_commerce.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record UserDto( @JsonProperty("id") String id,
                       @JsonProperty("name") String name,
                       @JsonProperty("email") String email,
                       @JsonProperty("password") String password,
                       @JsonProperty("address") String address,
                       @JsonProperty("favoriteList") List<ProductDto> favoriteList ) {
}
