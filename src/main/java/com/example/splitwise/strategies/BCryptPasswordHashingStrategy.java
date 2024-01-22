package com.example.splitwise.strategies;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordHashingStrategy {
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public BCryptPasswordHashingStrategy(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public String hashPassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    public boolean match(String password, String hashedPassword) { //check password
        return bCryptPasswordEncoder.matches(password, hashedPassword);
    }


}
