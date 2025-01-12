package fr.pathinov.bootcamp.services;

import org.springframework.stereotype.Service;

import fr.pathinov.bootcamp.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

}
