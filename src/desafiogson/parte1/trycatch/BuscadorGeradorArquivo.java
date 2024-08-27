package desafiogson.parte1.trycatch;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuscadorGeradorArquivo {
    public  void salvaJson(BuscadorEndereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter(endereco.cep()+".json");

        escrita.write(gson.toJson(endereco));

        escrita.close();

    }
}
