package com.e_commerce.demo.database.models;

import com.e_commerce.demo.dtos.UserDto;

import java.time.LocalTime;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private String address;
    private List<Product> favoriteList;

    public User(String name, String email, String password, String address) {
        this.setId(Math.abs(LocalTime.now().hashCode()));
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setAddress(address);
    }

    public User(UserDto user) {
        this.id = user.id();
        this.setName(user.name());
        this.setEmail(user.email());
        this.setPassword(user.password());
        this.setAddress(user.address());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = String.valueOf(id);
    }

    public List<Product> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<Product> favoriteList) {
        this.favoriteList = favoriteList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User {" + '\n' +
                "id: " + this.getId() + '\n' +
                "name: " + this.getName() + '\n' +
                "email: " + this.getEmail() + '\n' +
                "address: " + this.getAddress() + '\n' +
                "favoriteList: " + this.getFavoriteList() + '\n' +
                '}';
    }
}
