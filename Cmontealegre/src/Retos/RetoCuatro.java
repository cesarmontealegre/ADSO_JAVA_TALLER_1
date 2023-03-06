package Retos;
import java.util.Random;
import java.util.Scanner;

public class RetoCuatro {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
        System.out.println("Elija una opción: (1) Piedra, (2) Papel, (3) Tijera");
        int eleccion = scanner.nextInt();

        int resultado = random.nextInt(3) + 1; // 1 para piedra, 2 para papel, 3 para tijera

        System.out.println("Tu elección fue " + opcionToString(eleccion));
        System.out.println("La máquina eligió " + opcionToString(resultado));

        if (eleccion == resultado) {
            System.out.println("Empate!");
        } else if ((eleccion == 1 && resultado == 3) || (eleccion == 2 && resultado == 1) || (eleccion == 3 && resultado == 2)) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
        scanner.close();
    }

          public static String opcionToString(int opcion) {
              if (opcion == 1) {
                  return "Piedra";
              } else if (opcion == 2) {
                  return "Papel";
              } else if (opcion == 3) {
                  return "Tijera";
              } else {
                  return "";
              }
          }
}
