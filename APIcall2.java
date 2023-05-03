import java.net.URI;
import java.net.http.*;

public class APIcall2{
    public static void main(String[] args) throws Exception {

        var url= "https://api.nationalize.io/?name=nathaniel";

        
        var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client = HttpClient.newBuilder().build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());

        System.out.println(response.body());

    }
}