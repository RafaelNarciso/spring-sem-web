package br.com.alura.screenmatch.calculos;
//crtl + / para comenta :::: para organinar os imports crtl + alt + o
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui (Titulo titulo){
        System.out.println("Adicionando duração em minutos "+ titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }



}
