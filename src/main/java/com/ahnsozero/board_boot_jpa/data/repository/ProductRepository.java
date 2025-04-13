package com.ahnsozero.board_boot_jpa.data.repository;

import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
