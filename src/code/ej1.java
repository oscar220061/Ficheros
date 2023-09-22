package code;

import java.io.File;

public class ej1 {

    public static void checkFiles() {
        File f1 = new File("src/resources/fileEj1.txt");
        File f2 = new File("src/resources/fileEj2.txt");
        File dir1 = new File("src/resources/ej1");
        File dir2 = new File("src/resources/ej2");
        existe(f1);
        existe(f2);
        existe(dir1);
        existe(dir2);
    }

    public static void existe(File f) {
        boolean existe = false;
        if (f.exists()) {
            System.out.print(f.getName() + " existe");
            if(f.isDirectory()){
                System.out.println(" y es un directorio");
            }else{
                System.out.println(" y es un archivo");
            }
        } else {
            System.out.println(f.getName() + " no existe");
        }
    }
}