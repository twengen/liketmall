package com.item.liketmal.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShopCart {
    private String img;
    private BigDecimal price;
    private String attr;
    private String title;
}
