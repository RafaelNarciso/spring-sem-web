package desafioModulo4;

import java.util.Scanner;

public class TabuadaMultiolicacao implements Tabuada{

    private  int numero = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public double mostrarTabuada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("______tabuada de Multiplicação_______");
        System.out.println("=====================================");
        System.out.print("Informe um numero inteiro para realizar a tabuada :");
        setNumero(sc.nextInt());
        for (int i = 1; i < 11; i++) {
            System.out.println(getNumero() + " x " + i + " = " + (getNumero() * i));
        }
        System.out.println("Obrigado!!!");


        sc.close();
        return 0;
    }
}
