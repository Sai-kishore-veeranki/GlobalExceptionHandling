package com.vsk.ExceptionHandling.exception;


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
