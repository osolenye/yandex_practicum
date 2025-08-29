package sprint7.network_requests;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HTTPClient {
    public static void main(String[] args) throws Exception{
        // HttpRequest defines the request to a server
        // HttpResponse defines the server's response.
        // HttpClient implements makes requests to a server defined by two above classes

        // first create URI instance that contains server's address
        URI uri = URI.create("https://httpstatuses.com/418");
        HttpRequest.Builder builder = HttpRequest.newBuilder();

        // just made a request
        HttpRequest request = builder
                .GET() // http method
                .uri(uri) // resource address
                .version(HttpClient.Version.HTTP_1_1) // http protocol's version
                .header("Accept", "text/html") // what we will accept as a response
                .build();

        // making an HTTP client. Can use a builder but mostly default settings are good to go
        HttpClient httpClient = HttpClient.newHttpClient();

        // server's response handler that will convert it into a string
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        HttpResponse<String> response = httpClient.send(request, handler);
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
