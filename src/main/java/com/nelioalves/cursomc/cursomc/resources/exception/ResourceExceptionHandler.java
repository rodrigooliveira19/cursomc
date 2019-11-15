package com.nelioalves.cursomc.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nelioalves.cursomc.cursomc.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	/*@ControllerAdvice - interceptador de exceções geradas por metodos que tem a 
	 * anotação @RequestMapping
	 * @ExceptionHandler - indica que é um tratador de excecao da classe
	 * especificada. 
	 */
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e,
														 HttpServletRequest request) {
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), 
											  e.getMessage(), System.currentTimeMillis()); 
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}

}
