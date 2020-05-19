package com.company.pozdniakov;

public class IncorrectSalaryException extends Exception  {
    public IncorrectSalaryException(){
        super();
    }
    public IncorrectSalaryException(String description){
        super(description);
    }
    public IncorrectSalaryException(Throwable cause){
        super(cause);
    }
    public IncorrectSalaryException(String description,Throwable cause){
        super(description);
    }
}

