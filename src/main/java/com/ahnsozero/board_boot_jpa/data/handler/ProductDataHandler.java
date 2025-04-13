package com.ahnsozero.board_boot_jpa.data.handler;

import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;

public interface ProductDataHandler {
    ProductEntity saveProductEntity(
        String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
