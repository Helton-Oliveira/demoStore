package com.e_commerce.demo.database.models;

import com.e_commerce.demo.dtos.ProductDto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String nameProduct;
    private Double price;
    private String category;
    private String description;

    public Product(ProductDto productDto) {
        this.setNameProduct(productDto.productName());
        this.setPrice(productDto.price());
        this.setCategory(productDto.category());
        this.setDescription(productDto.description());
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return "R$ " + this.price;
    }

    public void setPrice(Double price) {
        BigDecimal convertedPrice = new BigDecimal(price * 5.46);
        this.price = convertedPrice.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  '\n' + "Product { " + '\n' +
                "nameProduct: " + this.getNameProduct() + '\n' +
                "price: " + this.getPrice() + '\n' +
                "category: " + this.getCategory() + '\n' +
                "description: " + this.getDescription() + '\n' +
                "}";
    }
}
