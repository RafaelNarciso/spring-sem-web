package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErrorDeConversaoDeAnoException("Não consegui converte o ano porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));

    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme:"  + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos:"  + duracaoEmMinutos);
        System.out.println("Incluído no plano :"  + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {

        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return  "nome = " + nome + ", anoDeLancamento = " + anoDeLancamento +", Duração em minutos " + duracaoEmMinutos +" min";
    }
}
