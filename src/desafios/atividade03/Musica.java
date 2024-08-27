package desafios.atividade03;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento = 0 ;
    double avaliacao = 0 ;
    int numeroDeAvaliacao = 0 ;

    double somaDaMusica = 0 ;

    public Musica() {

    }

    public Musica(String titulo, String artista, int anoDeLancamento, double avaliacao, int numeroDeAvaliacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
        this.numeroDeAvaliacao = numeroDeAvaliacao;
    }
    public void fichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Numero de avaliação: " + numeroDeAvaliacao);
        System.out.println();

    }
    public void avalia(double nota){
        somaDaMusica += nota;
        numeroDeAvaliacao++;

    }
    public double media(){
        return (somaDaMusica/numeroDeAvaliacao);

    }









}
