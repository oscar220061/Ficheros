package code;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {

    public static void checkDirectory(){
        Scanner sc = new Scanner(System.in);
        int contador;
        System.out.println("Introduce la ruta del directorio: ");
        String rutaDirectrio = sc.next();
        File f1 = new File(rutaDirectrio);
        if(f1.exists()){
            if(f1.isDirectory()){
                for(contador = 0; contador < f1.listFiles().length; contador ++){
                    System.out.println(Arrays.stream(f1.listFiles()).toList().get(contador).getName());
                }
            }else{
                System.out.println("Esta ruta no contiene un directorio");
            }
        }else{
            System.out.println("Esta ruta no contiene un directorio existente");
        }
    }
}
