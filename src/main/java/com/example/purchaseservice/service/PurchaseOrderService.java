package com.example.purchaseservice.service;

import com.example.purchaseservice.client.CatalogClient;
import com.example.purchaseservice.model.PurchaseOrder;
import com.example.purchaseservice.repository.PurchaseRepository;
import com.example.purchaseservice.response.ProductResponse;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@EnableFeignClients
public class PurchaseOrderService {

    private final PurchaseRepository purchaseRepository;
    private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseRepository purchaseRepository, CatalogClient catalogClient) {
        this.purchaseRepository = purchaseRepository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll(){
        return purchaseRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order){
        order.setId(null);
        return purchaseRepository.save(order);
    }

    public ProductResponse testCatalogConnection (Long productId){
        return catalogClient.getProductById(productId);
    }

}
