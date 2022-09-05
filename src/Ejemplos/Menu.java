package Ejemplos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args)throws IOException {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        String Marca, Modelo;
        int Precio;


        while (!salir) {

            System.out.println("1. Añadir a la lista");
            System.out.println("2. Eliminar de la lista");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Añadir a la lista");
                        //----------------------------------
                        PrintWriter salidaArchivo = new PrintWriter("salida.txt");
                        //Escribir sobre el archivo
                        System.out.println("Escribe la Marca");


                        System.out.println("Escribe el modelo");
                        System.out.println();
                        System.out.println("Escribe el precio");






                        //----------------------------------
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Eliminar de la lista");
                        break;
                    //----------------------------------








                    //----------------------------------
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Mostrar lista");
                        //----------------------------------









                        //----------------------------------
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}