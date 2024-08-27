package desafios.atividade01;

import desafios.carro.Pessoa;

public class PessoasPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.mostrar();

        PessoaClass pessoa = new PessoaClass();

        pessoa.nome = "Rafael ";
        pessoa.idade = 31;

        pessoa.exibir();

    }
}
