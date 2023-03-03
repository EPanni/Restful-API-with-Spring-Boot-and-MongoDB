package com.panni.restfulapi.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    
    public ObjectNotFoundException(String msg){
        super(msg);
        
    }
}
