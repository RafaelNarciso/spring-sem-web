package desafiomodulo03;

public class AnimalPrincipal {
    public static void main(String[] args) {
        AnimalCachorro caos = new AnimalCachorro();
        caos.setNome("Pacoça");
        caos.setPeso(6.360);
        caos.setCor("Branco com manchas marrons");
        caos.setIdade(7);
        caos.exibirDetalhes();
        caos.emitirSom();

        System.out.println("\n\n");

        AnimalGato felino = new AnimalGato();
        felino.setNome("Amexa");
        felino.setPeso(1.360);
        felino.setCor("Branco com manchas cinzas");
        felino.setIdade(2);
        felino.exibirDetalhes();
        felino.emitirSom();

    }
}
