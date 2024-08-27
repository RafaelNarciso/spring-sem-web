package desafioModulo4;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinancera {
    private double dolar = 0;
    private double qtd = 0.0;
    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {

        this.dolar = dolar;
    }
    public double getQtd() {
        return qtd;
    }
    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    @Override
    public double converterDolarParaReal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("_________Converta Dolar para real_______________");
        System.out.println("================================================");

        System.out.println("Digite o valor do dolar: ");
        setDolar(sc.nextDouble());
        System.out.println("Digite a quantidade de dolares: ");
        setQtd(sc.nextDouble());
        double real = getQtd() * getDolar();
        sc.close();
        return real;

    }
}
