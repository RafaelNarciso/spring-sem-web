package desafiogson.parte1;

public record PessoaRecord(String nome, int idade, String cidade) {
    @Override
    public String toString() {
        return "Ola " + nome + ", a sua idade e " + idade + " anos, e  mora na cidade de " + cidade ;
    }
}
