package server_code;

public interface HttpHandler {
    String handle(HttpRequest request, HttpResponse response);

}
