package Ejercicios;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        int hombreContador, mujerContador;

        hombreContador = 0;
        mujerContador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Elija la opcion que corresponda a su genero:\r\n1.Hombre\r\n2.Mujer");
            int genero;
            genero = Lectura.nextInt();

            if (genero == 1) {
                hombreContador++;
            } else if (genero == 2) {
                mujerContador++;
            } else {
                System.out.println("Ingrese una opción");
            }

            Lectura.nextLine();

        } 

        System.out.printf("La cantidad de hombres es: %d\r\nLa cantidad de mujeres es: %d\r\n", hombreContador, mujerContador);

        Lectura.close();
    } 
}
