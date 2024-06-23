package com.e_commerce.demo.database;

import java.io.IOException;

public interface ICrud {
    <T> Class<T> get(Class<T> toClass) throws IOException;
}
