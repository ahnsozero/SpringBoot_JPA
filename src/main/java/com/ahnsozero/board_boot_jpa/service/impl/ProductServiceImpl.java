package com.ahnsozero.board_boot_jpa.service.impl;

import com.ahnsozero.board_boot_jpa.data.dto.ProductDto;
import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;
import com.ahnsozero.board_boot_jpa.data.handler.ProductDataHandler;
import com.ahnsozero.board_boot_jpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDataHandler productDataHandler;

    @Override
    public ProductDto saveProduct(
        String productId, String productName, int productPrice, int productStock) {

        ProductEntity product =
            productDataHandler.saveProductEntity(
                productId, productName, productPrice, productStock);

        ProductDto productDto =
            new ProductDto(
                product.getId(), product.getName(), product.getPrice(), product.getStock());

        return productDto;
    }

    @Override
    public ProductDto getProduct(String productId) {

        ProductEntity product = productDataHandler.getProductEntity(productId);
        ProductDto productDto =
            new ProductDto(product.getId(), product.getName(), product.getPrice(), product.getStock());

        return productDto;
    }
}
