package com.qrmenu.qrmenuapp.utils.qrmenuexceptions;

/**
 * This class should implements the QrMenuException instead of extends it
 */

public class QrMenuObjectNotExistException extends QrMenuException {

    public QrMenuObjectNotExistException() {
        super();
    }

    public QrMenuObjectNotExistException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
