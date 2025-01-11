package fr.pathinov.bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.pathinov.bootcamp.models.Product;

public interface Produit extends JpaRepository<Product, Long>{

}
