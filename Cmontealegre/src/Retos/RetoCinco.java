package Retos;

import java.util.Scanner;

public class RetoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.next();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.next();

        System.out.println("La longitud del nombre es " + nombre.length());
        System.out.println("La longitud del apellido es " + apellido.length());

        String nombreMayusculas = nombre.toUpperCase();
        String apellidoMinusculas = apellido.toLowerCase();
        System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        System.out.println("Apellido en minúsculas: " + apellidoMinusculas);

        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre completo: " + nombreCompleto);

        String iniciales = nombre.substring(0, 2) + apellido;
        System.out.println("Iniciales: " + iniciales);

        scanner.close();
    }
}

