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

    public ProductModel getProduct(long id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }

    public ProductModel updateProduct(long id, ProductModel product) {
        ProductModel existingProduct = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
        
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        return productRepository.save(existingProduct);
    }

    public String deleteProduct(long idProduit) {
        ProductModel existingProduct = productRepository.findById(idProduit)
        .orElseThrow(() -> new RuntimeException("Product not found with ID: " + idProduit));

        productRepository.delete(existingProduct);
        return "Product successfully removed";
    }
}
