package server_code;

public class Main {
    public static void main(String[] args) {
    new Server((req, res) ->
            "<html><body><h1>Hallo alle zusammen</h1><body><html>"
    ).bootstrap();
    }
}

