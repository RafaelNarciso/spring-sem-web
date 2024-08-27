package desafios.atividade02;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.valor = 15;

        System.out.println("O valor dobrado atual é : "+ calculadora.dobro());

    }
}
