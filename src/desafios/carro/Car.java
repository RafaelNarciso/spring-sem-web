package desafios.carro;

public class Car {
    String marca;
    String modelo;
    int ano = 0;

public Car(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void  exibir(){
        String msg = String.format("O seu carro e da %s e o modelo %s e ano %d ", this.marca, this.modelo, this.ano);
        System.out.println(msg);
    }
}
