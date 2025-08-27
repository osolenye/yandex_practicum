package sprint7;

public class ClientServerModel {
    public static void main(String[] args) {
        // BASICS
        // network protocols are set of rules that are used to exchange data via networks
        // these protocols are divided by networking stack - each of them is in charge of doing something
        // most common network protocols are:
        // Internet Protocol (IP) - prepares data to sending and sends it to a receiver
        // Transmission Control Protocol - checks if IP has sent all data to the receiver, if not - sends again.
        // HyperText Transfer Protocol - uses IP and TCP and gives client-server model - e.g. browser receiving HTML page

        // URL AND HTML
        // http://info.cern.ch/hypertest/WWW/TheProject.html
        // URL starts with protocol e.g. http
        // server's name that gets the request e.g. info.cern.ch - via DNS this name is now associated with the server's IP address
        // other is the directory of the page

        // HTTP request structure
        // first line of client is the method (what the server should do)
        // server requests with status code
        // methods are get post put patch delete
        // server's responses - 200 - 299 are success codes
        // client's error - 400 - 499 errors
        // server side error - 500-599
        // headers:
        // accept - what data type the client can accept
        // host - server's address that the client is requesting to
        // content-length - requests body size
        // content-type - which type of data is being transferred
        // the body can be any. Most popular: json, file etc
    }
}
