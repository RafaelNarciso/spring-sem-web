package desafiogson.parte1.trycatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Desafio3Class extends Desafio3Acesso {




    public static void verifica(){


        Scanner sc = new Scanner(System.in);
        Acesso();
        System.out.println("================================================================");
        System.out.println("Informe o nome do usuario do Github : ");
        String nome = sc.nextLine().trim();

        String u = "https://api.github.com/users/" + nome;

        try {
            HttpClient usuario = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(u))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = usuario
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new Desafio3("Usuario não llocalizado ..");
            }

            String json = response.body();
            System.out.println(json);

        }catch (IOException | InterruptedException e){
            System.out.println("Ops !!\nHouve um erro durante a consulta a API do Github..");
            e.printStackTrace();
        }catch (Desafio3 ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Obrigado ate a proxima!!");
            sc.close();
        }



    }
}
