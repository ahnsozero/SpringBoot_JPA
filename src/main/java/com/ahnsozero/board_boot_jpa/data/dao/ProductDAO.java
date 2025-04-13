package com.ahnsozero.board_boot_jpa.data.dao;

import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity product);
    ProductEntity getProduct(String productId);
}
