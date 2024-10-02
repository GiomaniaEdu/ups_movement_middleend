package com.msf.movement.middleend.exceptions;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> exceptionNotControlled(Exception e) {
        return ResponseEntity.badRequest().body("error en la petición");
    }

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleFeignStatusException(FeignException ex, WebRequest request) {
        int statusCode = ex.status();
        return new ResponseEntity<>("Solicitud Incorrecta " + statusCode , HttpStatus.valueOf(statusCode));
    }




}
