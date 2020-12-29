package com.aws.techdemo.restcontroller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.aws.techdemo.exception.ExceptionResponse;

import javassist.NotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleGenericNotFoundException(NotFoundException e) {
		ExceptionResponse error = new ExceptionResponse();
		error.setDateTime(LocalDateTime.now());
		error.setMessage(e.getMessage());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
