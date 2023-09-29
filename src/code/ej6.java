package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ej6 {

    public static void checkFilesNIO() {

        Path f1 = Path.of("src/resources/ej3.txt");
        copiarFichero(f1);
    }

    static void copiarFichero(Path f){
        Path archivoOrigen = Path.of("src/resources/ej3.txt");
        Path archivoDestino = Path.of("src/resources/ej3Copia.txt");
        if(Files.exists(f)){
            if(f.toString().endsWith(".txt")){
                if(!Files.exists(archivoDestino)){
                    try{
                        Files.copy(archivoOrigen, archivoDestino);
                        System.out.println("Copia realizada con exito.");
                    } catch (IOException e) {
                        System.out.println("No se ha podido realizar la copia");;
                    }
                }else{
                    System.out.println("Ya existe una copia de este archivo.");
                }

            }else{
                System.out.println("Este directorio no es un archivo de texto.");
            }

        }else{
            System.out.println("Este archivo no existe.");
        }

    }
}
