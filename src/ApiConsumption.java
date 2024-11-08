import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConsumption {
    public static String getData(String urlAddress) throws IOException, InterruptedException {
        HttpResponse<String> response;

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlAddress))
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }

        return response.body();
    }
}
