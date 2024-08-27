package desafiomodulo02;

public class LivroPrincipal {
    public static void main(String[] args) {
        LivroClass deta = new LivroClass();
        deta.setTtulo("Java®: Como Programar ");
        deta.setAutor(" Paul Deitel, Harvey");

        deta.exibirDetalhes();
    }
}
