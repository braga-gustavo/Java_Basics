package apiusage.challenges.exceptionHandling;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import apiusage.challenges.exceptionHandling.integrations.GitHubConnectionException;

public class GitHubConnection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Github username: ");
        String requestValue = scanner.nextLine();
        String apiRawAddress = "https://api.github.com/users/";
        String apiAddress = apiRawAddress.concat(requestValue.replaceAll(" ", "+"));

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiAddress))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            System.out.println(apiAddress);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new GitHubConnectionException("User not found, try another: ");
            }
            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error when connecting to Github api...");
            e.printStackTrace();

        } catch (GitHubConnectionException e) {
            System.out.println(e.getMessage());
        }
    }
}
