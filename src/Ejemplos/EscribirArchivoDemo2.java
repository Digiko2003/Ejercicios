package Ejemplos;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
public class EscribirArchivoDemo2 {
    public static void main(String[] args) throws IOException     {
        String nombreArchivo; //nombre del archivo
        String nombreAmigo;         int numAmigos;

        Scanner entrada = new Scanner(System.in);

        // Obtener numero de amigos
        System.out.print("¿Cuantos amigos tienes?");         numAmigos= entrada.nextInt();

        //Consume the remaining newline character         entrada.nextLine();

        //Obtener nombre del archivo
        System.out.print("Indroduce el nombre del archivo: ");         nombreArchivo=entrada.nextLine();

        //Abrir el archivo
        PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
        //Obtener los datos y escribir en el archivo         for(int i=1; i<numAmigos; i++)
        {
            //Obtener el numero de un amigo
            System.out.print("Introduce el nombre del amigo" + "numero " +  " : ");
            nombreAmigo = entrada.nextLine();

            //Escribir nombre del archivo             salidaArchivo.println(nombreAmigo);
        }         //cerrar
        salidaArchivo.close();
        System.out.println("Datos escritos");
    }
}
