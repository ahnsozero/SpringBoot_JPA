package com.ahnsozero.board_boot_jpa.data.handler.impl;

import com.ahnsozero.board_boot_jpa.data.dao.ProductDAO;
import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;
import com.ahnsozero.board_boot_jpa.data.handler.ProductDataHandler;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {


    private final ProductDAO productDAO;


    @Override
    public ProductEntity saveProductEntity(
        String productId, String productName, int productPrice, int productStock) {

        ProductEntity product = new ProductEntity(productId, productName, productPrice, productStock);

        return productDAO.saveProduct(product);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}