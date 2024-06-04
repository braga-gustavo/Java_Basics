package api.usage.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RequestOMDBApiApp {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do filme: ");
        String requestValue = scanner.nextLine();
        String apiAdress = "http://www.omdbapi.com/?t=";
        String apiKey = "&apikey=2b301e2f";
        
        HttpClient client = HttpClient.newHttpClient();
        
        //replaceAll replaces the first value by the second
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiAdress.concat(requestValue.replaceAll(" ", "+")).concat(apiKey))).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
