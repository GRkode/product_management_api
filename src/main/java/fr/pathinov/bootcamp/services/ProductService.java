package fr.pathinov.bootcamp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.pathinov.bootcamp.models.ProductModel;
import fr.pathinov.bootcamp.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository productRepository;

    public List<ProductModel> getAllProduct() {
        return this.productRepository.findAll();
    }

    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }
}
