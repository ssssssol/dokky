package com.dokky.shop.api.product.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public @Getter class Product {
    @EmbeddedId
    ProductId productId;
}
