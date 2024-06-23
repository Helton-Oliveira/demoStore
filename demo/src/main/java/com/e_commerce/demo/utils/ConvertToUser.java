package com.e_commerce.demo.utils;

import com.e_commerce.demo.dtos.UserDto;
import com.e_commerce.demo.database.models.User;

public class ConvertToUser {

    public static User toConvert(UserDto user) {
        return new User(user);
    }
}
