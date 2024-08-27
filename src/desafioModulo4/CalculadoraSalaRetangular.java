package desafioModulo4;

import java.util.Scanner;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura = 0.0;
    private double largura = 0.0;

    public double getAltura() {return altura;}
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {return largura;}

    public void setLargura(double largura) {this.largura = largura;}

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("________________Area de um quadrado_____________");
        System.out.println("================================================");

        System.out.print("Informe a largura do quadrado : ");
        setLargura(scanner.nextDouble());
        System.out.print("Informe a Altura do quadrado : ");
        setAltura(scanner.nextDouble());

        double area = getLargura() * getAltura();
        String result = String.format("A area do quadrado é : %.2f",area);
        System.out.println(result);
        scanner.close();
        return 0;
    }
    @Override
    public double calcularPerimetro() {

        System.out.println("================================================");
        System.out.println("________________Area de um perimetro____________");
        System.out.println("================================================");

        double perimetro = 2 *(getAltura() + getLargura());
        System.out.println("O perimetro total :"+perimetro);
        return 0;
    }


}
