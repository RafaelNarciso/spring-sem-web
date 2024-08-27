package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão",1970);

        System.out.println("\n");

        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(true);


        filme.exibeFichaTecnica();
        filme.avalia(8.0);
        filme.avalia(5.0);
        filme.avalia(10.0);
        System.out.println("\n");

        System.out.println("A media total de avalição desse filme é "+ filme.pegaMedia());
        System.out.println("\n");

        Serie serie = new Serie("Lost",2020);

        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(50);

        System.out.println("Duração para maratonar a serie Lost: "+ serie.getDuracaoEmMinutos() +" minutos...");
        System.out.println("================================================================");
        Filme outrofilme = new Filme("Avatar",2023);
        outrofilme.setDuracaoEmMinutos(200);
        System.out.println("\n");

        System.out.println("================================================================");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outrofilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
        System.out.println("================================================================");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);
        filtro.filtra(outrofilme);
        System.out.println("================================================================");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        System.out.println("================================================================");
        var filmeDoRafa = new Filme("Dogville",2003);
        filmeDoRafa.setDuracaoEmMinutos(200);
        filmeDoRafa.avalia(10);

        System.out.println("================================================================");

        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(filmeDoRafa);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outrofilme);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println();
        System.out.println(listaDeFilmes.toString());


        System.out.println("\n================================");
        for (Filme fim : listaDeFilmes){
            System.out.println(fim);
        }
        System.out.println("================================================================");


    }
}


