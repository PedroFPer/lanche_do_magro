package org.pedro.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class UtilTools {
    public static void salvarFiles(String nomeImagem, String caminhoOrigem){
        String caminhoDestino = "C:/Users/Pichau/Downloads/" + nomeImagem + ".jpg" ;
        try{
            Path origem = Path.of(caminhoOrigem);
            Path destino = Path.of(caminhoDestino);

            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Imagem copiada com sucesso!");

        }catch(IOException e){
            System.out.println("Erro em adicionar imagem");
        }
    }
}
