package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {

        if (classificavel.getClassificacao() >= 4) {// <-polimorfismo
            System.out.println("Está entre os preferidos do momento !!!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!!!");
        } else {
            System.out.println("Adicione a sua lista para assistir depois!!");
        }

    }
    /*
     * Aqui estamos chamando a class Classificavel e criando um metodo
     * para poder inferir uma msg para o usuario
     * -> dentro de polimorfismo ..
     */

}
