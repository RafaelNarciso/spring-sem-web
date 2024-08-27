package desafiogson.parte1;

public class PessoaLivro extends Pessoa {
    private String autor = "";
    private String titulo = "";

    public PessoaLivro(String nome, int idade, String cidade, String autor, String titulo) {
        super(nome, idade, cidade);
        this.autor = autor;
        this.titulo = titulo;
    }
}
