package fr.pathinov.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.pathinov.bootcamp.models.ProductModel;
import fr.pathinov.bootcamp.services.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("test")    
    public String text() {
        return "success hello world !";
    }

    @GetMapping("products")
    public List<ProductModel> getProducts(@RequestParam String param) {
        return this.productService.getAllProduct();
    }

    @PostMapping("product")
    public ProductModel createProduct(@RequestBody ProductModel product) {
        
        return this.productService.createProduct(product);
    }
    
    
}
