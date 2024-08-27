package desafiogson.parte1;

public record Livro(String autor, String titulo, PessoaRecord pessoaRecor) {
    @Override
    public String toString() {
        return  "Autor(a) = " + autor  + ", titulo = " + titulo + "." + "\nDados = " + pessoaRecor ;
    }
}
