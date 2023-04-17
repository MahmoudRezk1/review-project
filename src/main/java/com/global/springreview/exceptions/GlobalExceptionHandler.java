package com.global.springreview.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> handleRecordNotFoundException(RecordNotFoundException exception){
        ErrorResponse error =  new ErrorResponse(exception.getLocalizedMessage()
                                                , Collections.singletonList(exception.getMessage())) ;
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}
