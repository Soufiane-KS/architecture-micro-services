package com.example.billingservice.repository;

import com.example.billingservice.entitites.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {

    Long id(Long id);
}
