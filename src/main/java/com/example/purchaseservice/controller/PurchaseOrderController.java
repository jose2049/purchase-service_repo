package com.example.purchaseservice.controller;

import com.example.purchaseservice.model.PurchaseOrder;
import com.example.purchaseservice.response.ProductResponse;
import com.example.purchaseservice.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService service;
    private final PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService service, PurchaseOrderService purchaseOrderService) {
        this.service = service;
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping
    public List<PurchaseOrder> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder purchaseOrder){
        return service.create(purchaseOrder);
    }

    @GetMapping("/test-catalog/{productId}")
    public ProductResponse testCatalogConnection(@PathVariable Long productId){
        return purchaseOrderService.testCatalogConnection(productId);
    }

}
