package com.company.pozdniakov;

public class FieldLengthLimitException extends Exception {
    public FieldLengthLimitException(){
        super();
    }
    public FieldLengthLimitException(String description){
        super(description);
    }
    public FieldLengthLimitException(Throwable cause){
        super(cause);
    }
    public FieldLengthLimitException(String description, Throwable cause){
        super(description);
    }
}

