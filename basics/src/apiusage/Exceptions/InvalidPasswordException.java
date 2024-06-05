package apiusage.Exceptions;

public class InvalidPasswordException extends RuntimeException {
  
    String message;
    public InvalidPasswordException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}
