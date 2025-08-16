package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {

    public void salvaJson(Conversao conversao) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter(conversao.base_code() + ".json");
        escrita.write(gson.toJson(conversao));
        escrita.close();
    }
}
