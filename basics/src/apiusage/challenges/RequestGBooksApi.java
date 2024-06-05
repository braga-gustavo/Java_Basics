package apiusage.challenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RequestGBooksApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String apiAddress = "https://www.googleapis.com/books/v1/volumes?q=";
        System.out.println("Book name: ");
        String requestValue = scanner.nextLine();
        final String apiKey = "AIzaSyAlRGtAck_JQjfm7tT8ovA0smpS-5L27-8";

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder().uri(URI.create(apiAddress.concat(requestValue.replaceAll(" ", "+")).concat("&key=").concat(apiKey))).build();
        var reponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(reponse.body());
    }

}