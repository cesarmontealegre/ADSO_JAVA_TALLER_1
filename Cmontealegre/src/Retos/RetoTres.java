package Retos;
import java.util.Random;
import java.util.Scanner;

public class RetoTres {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego del Carisellazo");
        System.out.println("Elija Cara (C) o Sello (S):");
        String eleccion = scanner.nextLine().toUpperCase();

        int resultado = random.nextInt(2); // 0 para cara, 1 para sello
        String resultadoString = (resultado == 0) ? "CARA" : "SELLO";

        if (eleccion.equals("C") && resultado == 0) {
            System.out.println("¡Ganaste! La moneda cayó en " + resultadoString);
        } else if (eleccion.equals("S") && resultado == 1) {
            System.out.println("¡Ganaste! La moneda cayó en " + resultadoString);
        } else {
            System.out.println("Perdiste. La moneda cayó en " + resultadoString);
        }
        scanner.close();
    }
}
