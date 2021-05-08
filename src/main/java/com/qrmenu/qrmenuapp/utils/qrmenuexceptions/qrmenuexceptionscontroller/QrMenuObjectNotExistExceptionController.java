package com.qrmenu.qrmenuapp.utils.qrmenuexceptions.qrmenuexceptionscontroller;

import com.qrmenu.qrmenuapp.utils.qrmenuexceptions.QrMenuObjectNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QrMenuObjectNotExistExceptionController {

    @ExceptionHandler(value = QrMenuObjectNotExistException.class)
    public ResponseEntity<Object> exception(QrMenuObjectNotExistException exception){
        return new ResponseEntity<>("Object not found",HttpStatus.NOT_FOUND);
    }
}
