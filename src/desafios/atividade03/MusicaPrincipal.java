package desafios.atividade03;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica principal = new Musica("Forro ","Wesley safadão", 2022,4.32,1);
        principal.fichaTecnica();

        Musica principal2 = new Musica();

        principal.avalia(7.0);
        principal.avalia(8.0);
        principal.avalia(9.0);

        System.out.println(principal.somaDaMusica);
        System.out.println("A media das notas :"+principal.media());
    }
}
