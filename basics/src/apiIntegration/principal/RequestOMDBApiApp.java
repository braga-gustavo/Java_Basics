import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import apiusage.modelos.Titulo;
import apiusage.principal.dto.OmdbTitleDTO;

public class RequestOMDBApiApp {
    public static void main(String[] args) throws IOException, InterruptedException {

        String search = "";
        String json = response.body();
        List<String> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Informe a title for the search");
            String requestValue = scanner.nextLine();
            String apiAdress = "http://www.omdbapi.com/?t=";
            String apiKey = "&apikey=2b301e2f";

            if (search.equalsIgnoreCase("exit")) {
                break;
            }
            HttpClient client = HttpClient.newHttpClient();

            // replaceAll replaces the first value by the second
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiAdress.concat(requestValue.replaceAll(" ", "+")).concat(apiKey))).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        }

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Program finalizaed with sucess");

        OmdbTitleDTO omdbdto = gson.fromJson(json, OmdbTitleDTO.class);
        System.out.println(omdbdto);
        Titulo title = new Titulo(omdbdto);
        System.out.println("Formated title: ");
        System.out.println(title);

    }
}
