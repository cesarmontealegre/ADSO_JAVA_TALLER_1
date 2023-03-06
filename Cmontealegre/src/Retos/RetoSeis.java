package Retos;

import java.util.Random;

public class RetoSeis {
    public static void main(String[] args) {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int total = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Total: " + total);

        if (total == 2 || total == 12) {
            System.out.println("Perdiste");
        } else if (total == 3 || total == 11) {
            System.out.println("Ganaste");
        } else if (total == 7) {
            System.out.println("Ganaste");
        } else if (dado1 == 1 && dado2 == 1) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}

