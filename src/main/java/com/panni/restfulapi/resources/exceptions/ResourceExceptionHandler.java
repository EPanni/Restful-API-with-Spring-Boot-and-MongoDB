package com.panni.restfulapi.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.panni.restfulapi.services.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        
        HttpStatus status = HttpStatus.NOT_FOUND;
        String error = "Not found";
        String message = e.getLocalizedMessage();
        String path = request.getRequestURI();
        
        StandardError err = new StandardError(System.currentTimeMillis(),status.value(),error, message, path);
        
        return ResponseEntity.status(status).body(err);
    }
}
