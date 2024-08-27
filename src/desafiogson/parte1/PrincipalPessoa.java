package desafiogson.parte1;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;


public class PrincipalPessoa {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*Atividade 1*/
        Pessoa pessoa = new Pessoa("Tony",92,"São Paulo");
        Gson rafa = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY.UPPER_CAMEL_CASE).create();
        String json = rafa.toJson(pessoa);
        PessoaRecord pessoa1 = rafa.fromJson( json, PessoaRecord.class);
        System.out.println(pessoa1);
        System.out.println("\n");


        /*Atividade 3*/
        Livro livro = new Livro("Agatha cristie","E não sobrou nenhum",pessoa1);
        Gson r = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY.UPPER_CAMEL_CASE).create();
        String json2 = r.toJson(livro);
        Livro pessoaLivro = r.fromJson( json2, Livro.class);
        System.out.println(pessoaLivro);


    }
}
