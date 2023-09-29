public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        String opcion = "";
        while (!salir) {

            System.out.println("1. Ejercicio 1 ficheros");
            System.out.println("2. Ejercicio 1 ficheros NIO");
            System.out.println("3. Ejercicio 2 listar directorios");
            System.out.println("3. Ejercicio 2 listar directorios NIO");
            System.out.println("4. Ejercicio 3 leer fichero NIO");
            System.out.println("0. Salir");


            opcion = String.valueOf(libs.Leer.introduceEntero());
            switch (opcion){
                case "0"->{
                    salir = true;
                }
                case "1"->{
                    code.ej1.checkFiles();
                }
                case "2"->{
                    code.ej1NIO.checkFilesNIO();
                }
                case "3"->{
                    code.ej2.checkDirectory();
                }
                case "4"->{
                    code.ej3.checkFilesNIO();
                }
                case "5"->{
                    code.ej6.checkFilesNIO();
                }
                default->{
                    System.out.println("Este número no está en el menú, escoge un número del 0 al 3.");
                }

                }

            }
        System.out.println("*********************");
        }
    }
