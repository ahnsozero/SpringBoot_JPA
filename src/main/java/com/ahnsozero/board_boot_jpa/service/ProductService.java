package com.ahnsozero.board_boot_jpa.service;

import com.ahnsozero.board_boot_jpa.data.dto.ProductDto;

public interface ProductService {
    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);
}
