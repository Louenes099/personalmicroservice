package com.islam.utils.exceptions;

public class NoContentException extends RuntimeException{



    public NoContentException(){}

    public NoContentException(String message){super(message);}

    public NoContentException(Throwable cause){super(cause);}

    public NoContentException(String message, Throwable cause){super(message, cause);}
}
