package server_code;

public class HttpRequest {
    private final static String DELIMITER = "\r\n\r\n";
    private final static String NEW_LINE = "\r\nr\n";

    private final String message;
    
    private final HttpMethod method;
    public HttpRequest(String message) {
        this.message = message;

        String[] parts = message.split(DELIMITER);

        String head = parts[0];

        String[] headers = head.split(NEW_LINE);
    }
}
