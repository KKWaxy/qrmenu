package com.qrmenu.qrmenuapp.utils.qrmenuexceptions;

public class QrMenuObjectNotExistExceptionFactory extends QrMenuExceptionFactory{
    @Override
    public QrMenuException createQrMenuException() {
        return new QrMenuObjectNotExistException();
    }
}
