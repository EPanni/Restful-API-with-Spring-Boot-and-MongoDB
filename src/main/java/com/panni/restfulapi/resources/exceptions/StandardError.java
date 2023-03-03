package com.panni.restfulapi.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
    private Long timestamp;
    private Long status;
    private Long error;
    private Long message;
    private Long path;

    public StandardError(){

    }

    public StandardError(Long timestamp, Long status, Long error, Long message, Long path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getError() {
        return error;
    }

    public void setError(Long error) {
        this.error = error;
    }

    public Long getMessage() {
        return message;
    }

    public void setMessage(Long message) {
        this.message = message;
    }

    public Long getPath() {
        return path;
    }

    public void setPath(Long path) {
        this.path = path;
    }

    
}
