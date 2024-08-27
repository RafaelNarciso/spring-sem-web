package desafiogson.parte1.trycatch;

public class Desafio2Verifica {


    public static void validador(String senha){
        senha = "rafa1234";
        if(senha.length() < 8){
            throw new Desafio2Class("A senha teve ter pelo menos 8 caracteres :");
        }
        else {
            System.out.println("Acesso permitido!!!");
        }
    }

}
