package sprint7.api;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

public class AdvancedApi {
    public static void main(String[] args) throws IOException {
        // InputStream getRequestBody() returns requests body from client
        // it returns InputStream so we need to read it for example by getting byte array
        HttpServer httpServer = HttpServer.create();
        httpServer.bind(new InetSocketAddress(8080), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
    }
}


class HelloHandler implements HttpHandler {
    // login of handling a request
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // getting the body and just resending it to the client to debug
        InputStream inputStream = exchange.getRequestBody();
        String body = new String(inputStream.readAllBytes(), "UTF-8");
        exchange.sendResponseHeaders(200, 0); // gives 200 code

        // getRequestMethod gets the method PUT or GET etc, used to make different calls to the same URL
        String method = exchange.getRequestMethod();

        // getRequestHeaders() gets the headers that the client sends. It can contain content-type
        Headers requestHeaders = exchange.getRequestHeaders();

        //getRequestURI() - gives the path parameters that the client has sent
        //used like /path/{id} - id is the path parameter
        URI requestURI = exchange.getRequestURI();
        String path = requestURI.getPath();
        String[] split = path.split("/");

        // we can get outputStream to give an answer
        if (method.equals("GET")) {
            try (OutputStream os = exchange.getResponseBody()) {
                os.write((body + "\n" + requestHeaders.entrySet().toString() + "\n" + path).getBytes());
            }
        } else if (method.equals("POST")) {
            try (OutputStream os = exchange.getResponseBody()) {
                os.write("no anser for POST request".getBytes());
            }
        }
    }
}