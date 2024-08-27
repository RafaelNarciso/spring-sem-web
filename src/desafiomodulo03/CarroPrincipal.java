package desafiomodulo03;

public class CarroPrincipal {
    public static void main(String[] args) {
        CarroModelo tabela = new CarroModelo();
        tabela.setMarca("Jeep");
        tabela.setModelo("renegade");
        tabela.setAno(2021);
        tabela.definindopreco(85472,78125,65328);
        tabela.exibirFichar();
    }
}
