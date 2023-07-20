package com.careerit.cbook.exceptions;

public class ContactException extends RuntimeException {

    public ContactException(String message) {
        super(message);
    }

    public ContactException(String message, Throwable t) {
        super(message, t);
    }
}
