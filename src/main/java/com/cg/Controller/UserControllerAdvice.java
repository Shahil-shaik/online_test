package com.cg.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.Exception.EntryMismatchError;
import com.cg.Exception.EntryNotFoundException;

@ControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(EntryNotFoundException.class)
    public final ResponseEntity<String> exceptionHandler( EntryNotFoundException e) 
    {
       
     System.out.println();
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(EntryMismatchError.class)
	   public final ResponseEntity<String> exceptionHandler( EntryMismatchError e) 
	   {
	       
	     System.out.println();
	        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	    }
}
