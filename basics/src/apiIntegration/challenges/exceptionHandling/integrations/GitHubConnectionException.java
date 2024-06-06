package apiusage.challenges.exceptionHandling.integrations;

public class GitHubConnectionException extends RuntimeException {
    private String message;

    public GitHubConnectionException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
    
}
