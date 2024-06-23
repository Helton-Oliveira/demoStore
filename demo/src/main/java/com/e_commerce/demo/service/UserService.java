package com.e_commerce.demo.service;

import com.e_commerce.demo.database.dao.UserDao;
import com.e_commerce.demo.dtos.UserDto;
import com.e_commerce.demo.database.models.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class UserService {
    private static final UserDao userDao = new UserDao("User");

    public static UserDto getUser() throws IOException{
        return userDao.get(UserDto.class);
    }

    public static void create(User user) throws IOException {
        userDao.create(user);
    }

}
