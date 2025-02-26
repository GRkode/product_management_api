package fr.pathinov.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.pathinov.bootcamp.models.ProductModel;
import fr.pathinov.bootcamp.services.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



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
    public ResponseEntity<List<ProductModel>> getProducts() {
        List<ProductModel> products = productService.getAllProduct();
        return ResponseEntity.ok(products);
    }

    @PostMapping("product")
    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductModel product) {
        ProductModel createProduct = productService.createProduct(product);
        return ResponseEntity.ok(createProduct);
    }

    @GetMapping("{id}")
    public ProductModel getProduct(@PathVariable("id") long idProduit) {
        return productService.getProduct(idProduit);
    }
    
    @PutMapping("product/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable long id, @RequestBody ProductModel product) {
        ProductModel updateProduct = productService.updateProduct(id, product);
        return ResponseEntity.ok(updateProduct); 
    }

    /**
     * idProduit est liée à la variable id grace à @PathVariable("id")
     * @param idProduit
     * @return string
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") long idProduit) {
        productService.deleteProduct(idProduit);
        return ResponseEntity.noContent().build();
    }
    
    
}
