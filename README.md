# API de Gestion de Produit - Spring Boot  

## Description  
Ce projet est une API REST développée avec **Spring Boot**, conçue pour gérer un catalogue de produits. Elle offre des fonctionnalités permettant de créer, lire, mettre à jour et supprimer (CRUD) des produits. Cette API peut être utilisée comme base pour des systèmes de gestion d'inventaire, des applications e-commerce, ou tout projet nécessitant une gestion de produits.  

## Fonctionnalités  
- **Ajout de produits** : Créer de nouveaux produits avec des informations comme le nom, la description, le prix, et la quantité en stock.  
- **Consultation des produits** : Obtenir la liste de tous les produits ou un produit spécifique via son identifiant.  
- **Mise à jour des produits** : Modifier les informations d’un produit existant.  
- **Suppression des produits** : Supprimer un produit de la base de données.  

## Technologies utilisées  
- **Java** : Langage principal du projet.  
- **Spring Boot** : Framework pour la création de l’API REST.  
- **Spring Data JPA** : Pour l'interaction avec la base de données.  
- **Base de données postgresql** : Base de données utilisée pour stocker les produits.  
- **Swagger** : Documentation et test interactif des endpoints REST.  

## Prérequis  
- Java 17 ou version ultérieure.  
- Maven ou Gradle installé.  
- Un IDE supportant Spring Boot (IntelliJ, Eclipse, VS Code, etc.).  

## Installation et Exécution  
1. Clonez ce dépôt :  
   ```bash  
   git clone https://github.com/votre-utilisateur/votre-repo.git  
   ```  

2. Accédez au dossier du projet :  
   ```bash  
   cd votre-repo  
   ```  

3. Compilez et lancez l'application avec Maven :  
   ```bash  
   mvn spring-boot:run  
   ```  

4. Accédez à l'API via `http://localhost:8080`.  

## Documentation de l'API  
La documentation interactive de l'API est disponible via **Swagger** à l'adresse suivante :  
`http://localhost:8080`.  

## Exemple d'Endpoints  
- **GET /products** : Récupère la liste de tous les produits.  
- **GET /products/{id}** : Récupère les détails d’un produit spécifique.  
- **POST /products** : Ajoute un nouveau produit.  
- **PUT /products/{id}** : Met à jour un produit existant.  
- **DELETE /products/{id}** : Supprime un produit.  

## Structure du projet  
```  
src/main/java  
├── fr.pathinov.bootcamp  
│   ├── controllers  
│   ├── services  
│   ├── repositories  
│   ├── models  
│   └── BootcampApplication.java  
```  

## Améliorations futures  
- Implémentation de la gestion des utilisateurs avec des rôles (admin, utilisateur).  
- Ajout de la pagination et du filtrage pour la liste des produits.  
- Intégration d’un système d’authentification et d’autorisation (JWT).  
- Tests unitaires et d'intégration avec JUnit et MockMVC.  

## Contributeurs  
- @GRkode  
