package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ej3 {

    public static void checkFilesNIO() {
        Path f1 = Path.of("src/resources/ej3.txt");
        leerFichero(f1);
    }
    static void leerFichero(Path f){

        if (Files.exists(f)){
            if(Files.isDirectory(f)){
                System.out.println("No se puede leer porque es un directorio.");
            }else{
                try{
                    Files.readAllLines(f).forEach((line)->{
                        System.out.println(line);});
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }catch(SecurityException e){
                    System.out.println("No tiene permiso de lectura de este directorio");
                }
            }
        }else{
            System.out.println("El archivo no existe");
        }
    }
}
