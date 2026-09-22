package com.tads.ecommerce.resource.exception;
import com.tads.ecommerce.service.exception.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler (ResourceNotFoundException.class)
    public ResponseEntity<StanderError> EntityNoFound(
            ResourceNotFoundException e, HttpServletRequest request){
        HttpStatus Status = HttpStatus.NOT_FOUND;
        StanderError error = new StanderError();
        error.setTimestamp(Instant.now());
        error.setStatus(Status.value());
        error.setMessage(e.getMessage());
        error.setError("Resource not Found");
        error.setPath(request.getRequestURI());

        return ResponseEntity.status(Status).body(error);
    }

}
