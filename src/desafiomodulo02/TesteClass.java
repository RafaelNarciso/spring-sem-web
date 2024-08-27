package desafiomodulo02;

public class TesteClass {
    private int ano = 0;
    private String nome ="";
    private  String sobreNome = "";
    private  double numeros =0.0;


    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setNumeros(double numeros) {
        this.numeros = numeros;
    }

    public  void  mostra(){
        String msg =
                String.format("Olá, %s %s voce naceu no ano de %d e seu salario começou com valor %.2f que legal ;)",
                        this.nome, this.sobreNome, this.ano,this.numeros);
        System.out.println(msg);

    }


}
