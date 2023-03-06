package Ejercicios;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double calificacion, sumaCalificaciones = 0, notafinal;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese su nota " + i + ": ");
            calificacion = lectura.nextDouble();
            sumaCalificaciones += calificacion;
        }

        notafinal = sumaCalificaciones / 4;

        if (notafinal >= 4.0) {
            System.out.println("Aprobaste con buenos resultados: " + notafinal); 
        } else if (notafinal < 3.0) {
            System.out.println("Reprobaste la asignatura: " + notafinal);
        } else {
            System.out.println("Pasaste la asignatura raspando: " + notafinal);
        }

        lectura.close();

    }
}
