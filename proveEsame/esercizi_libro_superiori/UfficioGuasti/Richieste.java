package UfficioGuasti;

public class Richieste {
    private String request, date;

    public Richieste(String request, String date) {
        this.request = request;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getRequest() {
        return request;
    }

    public String toString() {
        return "Richiesta: " + request + ", Data: " + date + "\n";
    }
}