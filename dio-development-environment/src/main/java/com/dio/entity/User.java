package com.dio.entity;

import java.util.UUID;

public class User {

    private final UUID cod;
    private final String name;

    public User(UUID cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public UUID getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                '}';
    }
}
