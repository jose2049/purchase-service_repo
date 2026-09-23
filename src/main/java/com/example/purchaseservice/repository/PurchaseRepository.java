package com.example.purchaseservice.repository;

import com.example.purchaseservice.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<PurchaseOrder,Long> {
}
