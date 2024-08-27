package desafiogson.parte1.trycatch;

import java.util.Scanner;

public class Desafio3Acesso {


    public static void Acesso() {
        Scanner sc = new Scanner(System.in);
        String senha = "rafa1234";

        System.out.print("Informe a senha: ");
        String senhaDigitada = sc.nextLine();

        while (!senhaDigitada.equals(senha)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Informe a senha: ");
            senhaDigitada = sc.nextLine();
        }

        System.out.println("Acesso permitido!!!");


    }


}
