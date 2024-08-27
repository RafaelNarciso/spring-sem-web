package desafiomodulo02;

import java.util.Scanner;

public class AlunClass {
    private String nome;
    private double nota = 0.0;
    private boolean continuar = true;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }

    public  void calcular(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("= Bora calcular a media das notas : ");
        System.out.println("====================================");
        while (continuar){
            double qtd = 0.0;
            System.out.println("Digite a quantidade de nota do aluno: ");
            qtd = sc.nextDouble();

            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite a "+(i + 1)+" do aluno: ");
                double notas = sc.nextDouble();
                this.nota += notas;
            }
            System.out.println("A media do Aluno é "+ String.format("%.2f",this.nota / qtd));
            System.out.print("Deseja continuar (S/N) : ");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("N")){
                continuar = false;
                System.out.println("Obrigado");
                break;

            }
        }


        sc.close();
    }

}
