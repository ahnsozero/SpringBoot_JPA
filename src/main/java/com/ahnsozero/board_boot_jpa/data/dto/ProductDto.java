package com.ahnsozero.board_boot_jpa.data.dto;

import com.ahnsozero.board_boot_jpa.data.entity.ProductEntity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    @Id
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    private int productPrice;

    @NotNull
    private int productStock;

    public ProductEntity toEntity() {
        return ProductEntity.builder()
                            .id(productId)
                            .name(productName)
                            .price(productPrice)
                            .stock(productStock)
                            .build();
    }
}