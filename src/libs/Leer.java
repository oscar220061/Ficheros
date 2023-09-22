package libs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leer {

    public static int introduceEntero(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Introduce un número entero:");
        int numero = 0;
        do{
            try{
                numero = sc.nextInt();
                flag = true;
            }catch(InputMismatchException ex) {
                System.out.println("Debes introducir un número entero.");
                System.out.println("Introduce un número entero:");
                sc.next();
            }
        }while(!flag);

        return numero;
    }

    public static void introduceDouble(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Introduce un número:");
        Double numero;
        do{
            try{
                numero = sc.nextDouble();
                flag = true;
            }catch(InputMismatchException ex) {
                System.out.println("Debes introducir un número.");
                System.out.println("Introduce un número:");
                sc.next();
            }
        }while(!flag);
    }
    public static void introduceLetra(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Introduce una letra:");
        String letra;
        do{
            try{
                letra = sc.next("[a-zA-Z]");
                flag = true;
            }catch(InputMismatchException ex) {
                System.out.println("Debes introducir una letra.");
                System.out.println("Introduce una letra:");
                sc.next();
            }
        }while(!flag);
    }
    public static void introducePalabra(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Introduce una palabra:");
        String palabra;
        do{
            try{
                palabra = sc.next("[a-zA-Z]+");
                flag = true;
            }catch(InputMismatchException ex) {
                System.out.println("Debes introducir una palabra.");
                System.out.println("Introduce una palabra:");
                sc.next();
            }
        }while(!flag);
    }
}
