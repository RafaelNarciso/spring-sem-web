package desafiomodulo02;

public class LivroClass {
    private String ttulo = "";
    private String autor = "";



    public void setTtulo(String ttulo) {
        this.ttulo = ttulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void exibirDetalhes(){
        String msg =
                String.format("============================\n" +
                        "Titulo : %s\n" +
                        "Autores: %s \n" +
                        "============================",this.ttulo,this.autor);
        System.out.println(msg);
    }
}
