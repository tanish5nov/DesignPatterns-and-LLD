package designpatterns.builderDesignPattern.exceptions;

public class MandatoryFieldsNotAvailableException extends RuntimeException{
    public MandatoryFieldsNotAvailableException(String exceptionMessage){
        super(exceptionMessage);
    }
}
