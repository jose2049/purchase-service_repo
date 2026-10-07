package com.example.purchaseservice.client;

import com.example.purchaseservice.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http://locahost:8080")
public interface CatalogClient {
    @GetMapping("products/{id}")
    ProductResponse getProductById(@PathVariable("id") Long id);
}
