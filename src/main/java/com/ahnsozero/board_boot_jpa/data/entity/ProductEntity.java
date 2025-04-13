package com.ahnsozero.board_boot_jpa.data.entity;

import com.ahnsozero.board_boot_jpa.data.dto.ProductDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "product")
public class ProductEntity {

    @Id
    String id;
    String name;
    Integer price;
    Integer stock;

  /*
  @Column
  String sellerId;

  @Column
  String sellerPhoneNumber;
   */

    public ProductDto toDto() {
        return ProductDto.builder()
                         .productId(id)
                         .productName(name)
                         .productPrice(price)
                         .productStock(stock)
                         .build();
    }
}