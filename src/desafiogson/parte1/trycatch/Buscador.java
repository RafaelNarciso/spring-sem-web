package desafiogson.parte1.trycatch;

import java.io.IOException;
import java.util.Scanner;

public class Buscador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BuscadorDeCep consulta = new BuscadorDeCep();

        System.out.println("\nInforme um número de CEP para consulta :");
        var cep = sc.nextLine();

        try {

            BuscadorEndereco novoEndereco = consulta.buscadorEndereco(cep);
            System.out.println(novoEndereco);
            BuscadorGeradorArquivo gerador = new BuscadorGeradorArquivo();
            gerador.salvaJson(novoEndereco);


        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Obrigado!!! ");
        }

    }

}
