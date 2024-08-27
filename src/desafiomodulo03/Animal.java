package desafiomodulo03;

public class Animal {
    private double peso;
    private String cor;
    private String nome;
    private int idade;

    public void exibirDetalhes(){
        String det = String.format("===============================================\n" +
                "Caracteristicas do Animal \n" +
                "===============================================\n" +
                "Nome do pet : %s \n" +
                "cor do pet : %s \n" +
                "peso do pet : %.2f \n" +
                "Idade do pet : %d \n" +
                "===============================================",this.nome,this.cor,this.peso,this.idade);
        System.out.println(det);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){

    }

}
