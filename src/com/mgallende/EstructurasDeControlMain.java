package com.mgallende;
/*
    Ejercicio tema 3 Estructuras de control
    1 - Crear el paquete,
    2 - crear la clase
    3 - crear un bucle que permita concatenar nombres que entregue un array
  */

public class EstructurasDeControlMain {

    public static void main (String[] args) {
        String[] nombres = {"Manuel Angel Gómez ", "Pilar García Rodríguez ", "Jorge Gómez García"};
        String nombresConcatenados = "";

        for (int i = 0; i < nombres.length; i++) {
            nombresConcatenados += nombres[i];
        }
        System.out.println (nombresConcatenados);
    }
}
