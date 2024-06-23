package com.e_commerce.demo.utils;

import com.e_commerce.demo.service.UserService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Validate {

    public static boolean isExist(String email) throws IOException {
        return UserService.getUser().email().equals(email);
    }
}
