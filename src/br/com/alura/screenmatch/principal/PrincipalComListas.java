package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão",1970);
        filme.avalia(9);
        Filme outrofilme = new Filme("Avatar",2023);
        outrofilme.avalia(9);
        var filmeDoRafa = new Filme("Dogville",2003);
        filmeDoRafa.avalia(10);
        Serie serie = new Serie("Lost",2000);
        serie.avalia(10);

        List<Titulo> lista = new LinkedList<>();//parametrizando o array atraves do titulo
        lista.add(filmeDoRafa);
        lista.add(filme);
        lista.add(outrofilme);
        lista.add(serie);

        for (Titulo item : lista) {

            System.out.println(item.getNome());

            if(item instanceof Filme film && film.getClassificacao() > 2){//realizando cast obrigando a classificar todos como filme
                System.out.println("Classificação :"+ film.getClassificacao());
            }

        }
        ArrayList<String> buscarPorArtistas = new ArrayList<String>();
        buscarPorArtistas.add("Adam");
        buscarPorArtistas.add("Paulo");
        buscarPorArtistas.add("Rafael");
        buscarPorArtistas.add("Bruno");
        System.out.println(buscarPorArtistas);


        Collections.sort(buscarPorArtistas);
        System.out.println(buscarPorArtistas);

        Collections.sort(lista);
        System.out.println("====================================================");
        System.out.println("Lista de titulo com a função comparable:\n");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for (Titulo it : lista){
            System.out.println(it);
            System.out.println("====================================================");
        }



    }
}
