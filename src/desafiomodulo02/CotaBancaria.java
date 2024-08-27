package desafiomodulo02;

public class CotaBancaria {
    private  String nome;
    private  int agencia = 0;
    private int numeroDaConta = 0;
    private  double saldo = 0.0;

    public void dados(){
        String msg =
                String.format("===============================================\n" +
                "Titular da conta : %s \n" +
                "Agencia: %d \n" +
                "nomero da conta: %d\n" +
                "Saldo: %.2f R$ ", this.nome, this.agencia, this.numeroDaConta, this.saldo);

        System.out.println(msg);
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNome(String nome) {this.nome = nome;}
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
