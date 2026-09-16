package com.example.purchaseservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
    private Long id;
    private Long productId;
    private int quantity;
}
