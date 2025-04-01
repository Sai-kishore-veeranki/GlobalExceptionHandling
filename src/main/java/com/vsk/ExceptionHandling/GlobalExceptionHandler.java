package com.vsk.ExceptionHandling;

import com.vsk.ExceptionHandling.entities.ExceptionResponse;
import com.vsk.ExceptionHandling.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleProductNotFoundException(ProductNotFoundException e) {
        ExceptionResponse response = new ExceptionResponse(
                LocalDateTime.now(), // Using LocalDateTime for better timestamp handling
                e.getMessage(),      // Exception message
                "Exception in the products service" // Custom error detail
        );

        // Returning ResponseEntity with HTTP status NOT_FOUND
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
