package com.projeto.desafioanota.controllers;

import com.projeto.desafioanota.domain.category.Category;
import com.projeto.desafioanota.domain.category.CategoryDTO;
import com.projeto.desafioanota.domain.product.Product;
import com.projeto.desafioanota.domain.product.ProductDTO;
import com.projeto.desafioanota.services.CategoryService;
import com.projeto.desafioanota.services.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Product> insert(@RequestBody ProductDTO productDTOData){
        Product newProduct = this.service.insert(productDTOData);
        return ResponseEntity.ok().body(newProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products = this.service.getAll();
        return ResponseEntity.ok().body(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathParam("id") String id, @RequestBody ProductDTO productData){
        Product updatedProduct = this.service.update(id, productData);
        return ResponseEntity.ok().body(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathParam("id") String id){
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
