package com.example.splitwise.models;

import com.example.splitwise.dtos.UserDTO;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class User extends BaseModel {
    private String name;
    private String phoneNumber;
    private String password;

    public UserDTO toDto() {
        UserDTO userDTO = new UserDTO();
        userDTO.setPhoneNumber(phoneNumber);
        userDTO.setName(name);
        return userDTO;
    }


}