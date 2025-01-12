package fr.pathinov.bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.pathinov.bootcamp.models.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, Long>{}
