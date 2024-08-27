package desafiomodulo03;

public class CarroModelo {
    private String marca ="";
    private String modelo ="";
    private int ano = 0;
    private double precoAno1 =0.0;
    private double precoAno2 =0.0;
    private double precoAno3 =0.0;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void definindopreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    private  double tabelaMenor(){
        double valor = precoAno1;
        if (precoAno2 < valor){
            valor = precoAno2;
        }
        if (precoAno3 < valor){
            valor = precoAno3;
        }
        return valor;
    }

    private double tabelaMaior(){
        double valore = precoAno1;
        if (precoAno2 > valore){
            valore = precoAno2;
        }
        if (precoAno3 > valore){
            valore = precoAno3;
        }
        return valore;
    }


    public  void exibirFichar(){
        String msg =
                String.format("==================================================================================================\n" +
                        "\nOlá o seu veiculo de marca %s, e modelo %s \n" +
                        "e ano de fabricação %d ",this.marca,this.modelo,this.ano);
        String msgs =
                String.format("\n=================================================" +
                        "=================================================\n" +
                        "Valor do primeiro ano :%.2f R$\n" +
                        "Valor do segundo ano  :%.2f R$\n" +
                        "Valor do terceiro ano :%.2f R$\n" +
                        "Valor mais alto : %.2f R$\n" +
                        "Valor mais em conta: %.2f R$ \n" +
                        "=================================================" +
                        "================================================="
                        ,this.precoAno1, this.precoAno2, this.precoAno3, this.tabelaMaior(),this.tabelaMenor());
        System.out.println(msg);
        System.out.println(msgs);
    }










}
