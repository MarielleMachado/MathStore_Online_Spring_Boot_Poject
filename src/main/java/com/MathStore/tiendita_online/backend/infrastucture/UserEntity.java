package com.MathStore.tiendita_online.backend.infrastucture;

import com.MathStore.tiendita_online.backend.domain.model.UserType;

import java.time.LocalDateTime;

public class UserEntity {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String adres;
    private String cellphone;
    private String password;
    private UserType userType;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
