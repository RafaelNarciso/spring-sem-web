package desafiogson.parte1.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bora realizar divisão matematica : ");
        try {
            System.out.print ("Informe um número inteiro para saber a quantidade de que sera realizada : ");
            while (!sc.hasNextInt()){
                System.out.println("Informe um número inteiro : ");
                sc.next();
            }
            int numero = sc.nextInt();
            for (int i = 0; i < numero; i++) {
                System.out.print("Informe o " + (i + 1) + " valor : ");
                while(!sc.hasNextDouble()){
                    System.out.println("Informe apenas numero de pontos flutuante : ");
                    sc.next();
                }
                double d = sc.nextDouble();
                System.out.println("=========================================");
                System.out.print("Informe o " + (i + 1) + " valor: ");
                while(!sc.hasNextDouble()){
                    System.out.println("Informe apenas numero de pontos flutuante : ");
                    sc.next();
                }
                double d2 = sc.nextDouble();
                System.out.println("=========================================");
                if (d2 == 0 || d == 0) {
                    System.out.println("Não é possível realizar a divisão por zero");
                } else {
                    System.out.println("O resultado da dessa divisão :");
                    double total = d / d2;
                    System.out.println();
                    System.out.format("%.2f\n", total);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas numero interos: "+ e.getMessage());
        }finally {
            sc.close();
            System.out.println("Obrigado !!\nAte a proxima!!");
        }



    }
}
