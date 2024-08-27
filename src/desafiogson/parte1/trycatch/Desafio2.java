package desafiogson.parte1.trycatch;

import java.util.Scanner;

public class Desafio2 extends Desafio2Verifica{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Para acessar a mensagem informe a senha com 8 digitos : ");
            String senha = sc.nextLine();
            validador(senha);
        }catch (Desafio2Class e){
            System.out.println("Erro "+ e.getMessage());
        }finally {
            System.out.println("Obrigado!!\nAte a proxima..");
            sc.close();
        }

    }

}
