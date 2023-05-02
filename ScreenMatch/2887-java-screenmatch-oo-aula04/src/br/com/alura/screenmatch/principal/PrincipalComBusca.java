package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme que deseja realizar a busca");

        String busca = leitura.nextLine();

      //AO ESCREVER UM NOME COM ESPAÇOS... FAZER ALGO QUE AO PEGAR O NOME

        String buscaFormatado = busca.replaceAll(" ","+");

        System.out.println(buscaFormatado);

        String chave = "8371c685";

        String endereco = "https://www.omdbapi.com/?t=" +buscaFormatado + "&apikey=" +chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
