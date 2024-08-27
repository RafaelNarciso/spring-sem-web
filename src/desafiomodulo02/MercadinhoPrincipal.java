package desafiomodulo02;

public class MercadinhoPrincipal {
    public static void main(String[] args) {
        MercadinhoClass produt = new MercadinhoClass();

        produt.setNomeDoProduto("Sabão de coco ");
        produt.setPrecoDoProduto(11.98);
        produt.listaDeProduto();

        System.out.println(produt.desconto(0.5));


    }
}
