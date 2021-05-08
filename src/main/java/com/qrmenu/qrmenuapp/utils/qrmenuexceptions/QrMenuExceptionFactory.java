package com.qrmenu.qrmenuapp.utils.qrmenuexceptions;

/**
 *
 */
public abstract class QrMenuExceptionFactory {

    QrMenuException exception = createQrMenuException();
    public abstract QrMenuException createQrMenuException();
}
