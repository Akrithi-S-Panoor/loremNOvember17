package com.robosoft.lorem.Exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@NoArgsConstructor
public class GlobalExceptionHandling
{

    @ExceptionHandler(value = ExpiredJwtException.class)
    public ResponseEntity<String> handleJWTToken(com.robosoft.lorem.Exception.ExpiredJwtException e)
    {
        return new ResponseEntity<String>("Session has been Expired, Please login again", HttpStatus.BAD_REQUEST);

    }

}