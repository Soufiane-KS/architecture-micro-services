package com.example.billingservice.repository;

import com.example.billingservice.entitites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
