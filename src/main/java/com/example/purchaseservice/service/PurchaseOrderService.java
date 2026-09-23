package com.example.purchaseservice.service;

import com.example.purchaseservice.model.PurchaseOrder;
import com.example.purchaseservice.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseOrderService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<PurchaseOrder> getAll(){
        return purchaseRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order){
        order.setId(null);
        return purchaseRepository.save(order);
    }
}
