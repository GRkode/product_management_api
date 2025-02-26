package fr.pathinov.bootcamp.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private int statusCode;          // Code HTTP (ex. 404, 500)
    private String message;          // Message d'erreur
    private LocalDateTime timestamp; // Horodatage de l'erreur
}
