package com.ahnsozero.board_boot_jpa.data.dao.impl;

import com.ahnsozero.board_boot_jpa.data.dao.ProductDAO;
import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;
import com.ahnsozero.board_boot_jpa.data.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }

    /** Repository에서 기본적으로 제공하는 대표적인 메소드 */
    private void testRepositoryMethod() {
    /*    productRepository.save();
    productRepository.getById();
    productRepository.delete();
    productRepository.deleteAll();
    productRepository.findAll();
    productRepository.saveAll();*/
    }
}
