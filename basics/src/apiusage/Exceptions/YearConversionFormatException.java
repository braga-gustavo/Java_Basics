package apiusage.Exceptions;

public class YearConversionFormatException extends RuntimeException {

    private String message;
    public YearConversionFormatException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
