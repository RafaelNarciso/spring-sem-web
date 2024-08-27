package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();

        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("INforme um filme para busca: ");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair ")) {
                break;
            }

            /* Captura do dado e implementada no json API */
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d0bc9998";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco)) // Colocando a chave para buscar
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);// adicionando a lista os filmes do meu titulo

            } catch (NumberFormatException e) {
                System.out.println("!ERRO ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {

                System.out.println("Endereço invalido!!");
                System.out.println(e.getMessage());

            } catch (ErrorDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        }

        System.out.println("A lista de titulos: \n" + titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("=================================");
        System.out.println("Obrigado !!!");
        sc.close();
    }
}
