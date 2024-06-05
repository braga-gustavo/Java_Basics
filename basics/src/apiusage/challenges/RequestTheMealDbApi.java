package apiusage.challenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RequestTheMealDbApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Recipe name: ");
        String requestValue = scanner.nextLine();

        //It is mandatory to have "https://" befor the actual link.
        final String apiAdress = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiAdress.concat(requestValue)))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
