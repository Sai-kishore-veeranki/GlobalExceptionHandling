package com.vsk.ExceptionHandling.entities;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
public class ExceptionResponse {

    LocalDateTime exceptionDate;
    String message;
    String details;
    public ExceptionResponse(LocalDateTime exceptionDate, String message, String details) {
        this.exceptionDate = exceptionDate;
        this.message = message;
        this.details = details;
    }
}
