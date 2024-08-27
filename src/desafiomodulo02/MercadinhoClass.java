package desafiomodulo02;

import java.util.Scanner;

public class MercadinhoClass {
    private String nomeDoProduto = "";
    private double precoDoProduto = 0.0;

    public double desconto (double desc){
        return this.precoDoProduto - (this.precoDoProduto * desc);
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public  void  listaDeProduto(){
        String msg = String.format("=======Lista de Produto=======\n" +
                "nome de produto: %s\n " +
                "Preço do produto : %.2f\n",this.nomeDoProduto,this.precoDoProduto);
        System.out.println(msg);
    }
}
