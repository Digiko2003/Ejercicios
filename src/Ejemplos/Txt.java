package Ejemplos;

import java.io.IOException;
import java.io.PrintWriter;

public class Txt {
    public static void main(String[] args)throws IOException{
        //Abrir archivo
        PrintWriter salidaArchivo = new PrintWriter("salida.txt");
        //Escribir sobre el archivo
        salidaArchivo.println("Hola");
        //Cerrar el archivo
        salidaArchivo.close();

        System.out.println("Datos grabados en el archivo");
    }
}
