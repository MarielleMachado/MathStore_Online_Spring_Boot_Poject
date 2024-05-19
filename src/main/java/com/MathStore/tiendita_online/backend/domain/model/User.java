package com.MathStore.tiendita_online.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data //Get Set
@AllArgsConstructor //constructor
@NoArgsConstructor //empty constructor
public class User {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String adres;
    private String cellphone;
    private String password;
    private UserType userType;
    private  LocalDateTime dateCreated;
}
