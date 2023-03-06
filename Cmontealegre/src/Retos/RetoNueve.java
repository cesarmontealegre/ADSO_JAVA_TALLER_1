package Retos;

import java.util.Scanner;
import java.util.Random;

public class RetoNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        double apuesta = 10.0;
        double acumulado = 0.0;
        int contador = 0;
        boolean seguirJugando = true;
        
        System.out.println("Bienvenido al juego del carisellazo!");
        System.out.println("Cada ronda cuesta " + apuesta + " pesos. ¿Cuánto dinero quieres apostar en esta ronda?");
        
        while (seguirJugando) {
            double dineroApostado = sc.nextDouble();
            
            if (dineroApostado > acumulado) {
                System.out.println("Lo siento, no tienes suficiente dinero para realizar esa apuesta.");
                continue;
            }
            
            // Lanzar los dados
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            int totalDados = dado1 + dado2;
            
            System.out.println("Los dados han salido " + dado1 + " y " + dado2 + " (total: " + totalDados + ").");
            
            // Comprobar si el jugador ganó o perdió
            if (totalDados == 7 || totalDados == 11) {
                acumulado += dineroApostado * 2.0;
                apuesta = 10.0;
                contador++;
                System.out.println("¡Ganaste! Has ganado " + (dineroApostado * 2.0) + " pesos.");
            } else if (totalDados == 2 || totalDados == 3 || totalDados == 12) {
                acumulado -= dineroApostado;
                apuesta = apuesta * 2.0;
                contador++;
                System.out.println("¡Perdiste! Has perdido " + dineroApostado + " pesos.");
            } else {
                apuesta = 10.0;
                System.out.println("No ganaste ni perdiste. Sigue intentando.");
            }
            
            System.out.println("Tu saldo actual es de " + acumulado + " pesos.");
            System.out.println("La siguiente ronda cuesta " + apuesta + " pesos. ¿Quieres seguir jugando? (s/n)");
            
            String respuesta = sc.next();
            
            if (respuesta.equalsIgnoreCase("n")) {
                seguirJugando = false;
            }
        }
        
        System.out.println("Has jugado " + contador + " rondas y acumulaste " + acumulado + " pesos.");
        sc.close();
    }
}

