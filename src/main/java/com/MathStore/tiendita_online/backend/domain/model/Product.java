package com.MathStore.tiendita_online.backend.domain.model;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private  Integer id;
    private  String name;
    private  String code;
    private String description;
    private BigDecimal price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private Integer userID;
    private Integer categoryId;
}
