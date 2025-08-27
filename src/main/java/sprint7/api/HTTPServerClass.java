package sprint7.api;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HTTPServerClass {
    public static void main(String[] args) throws IOException {
        // ports are used in OS to give information to a specific program
        // socket - OS utility that lets a program network access. It takes IP and network port as parameters
        // to open socket for a program the program should give the OS a specific IP address and the port number

        HttpServer httpServer = HttpServer.create();
        // need to connect httpServer to a port
        httpServer.bind(new InetSocketAddress(8080), 0); // the program listens 8080 port
        // second parameter is backlog - how many connections the server is able to handle(other will be interrupted)

        // making an endpoint that uses our handler for a request
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
    }
}

// creating a handler that will handle requests
class HelloHandler implements HttpHandler {
    // login of handling a request
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Welcome to my server";
        exchange.sendResponseHeaders(200, 0); // gives 200 code
        // we can get outputStream to give an answer
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}