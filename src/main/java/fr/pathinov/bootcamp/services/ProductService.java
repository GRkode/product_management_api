package fr.pathinov.bootcamp.services;

import org.springframework.stereotype.Service;

import fr.pathinov.bootcamp.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository productRepository;
}
