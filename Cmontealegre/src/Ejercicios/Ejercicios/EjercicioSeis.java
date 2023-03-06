package Ejercicios;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
      Scanner lectura = new Scanner(System.in);
      
      
      System.out.println("Ingresa  el Usuario");
      String userName;
      userName = lectura.nextLine();


      System.out.println("Ingrese la contraseña");
      String password;
      password= lectura.nextLine();

      String userNameBd = "user";
      String passwordBd = "password";

      int caso = 0;
          if (userNameBd.equals(userName) && passwordBd.equals(password)) {
            caso = 1;
          } else if (userNameBd.equals(userName) && !passwordBd.equals(password)) {
            caso = 2;
          } else if (!userNameBd.equals(userName) && passwordBd.equals(password)) {
            caso = 3;
          } else if (!userNameBd.equals(userName) && !passwordBd.equals(password)) {
            caso = 4;
      }

      switch (caso) {
          case 1:
            System.out.println("Bienvenido al SI.");
            break;
          case 2:
            System.out.println("Parece que no recuerdas tu contraseña.");
            break;
          case 3:
            System.out.println("Tus credenciales son incorrectas.");
            break;
          case 4:
            System.out.println("Acceso Denegado.");
            break;
          default:
            System.out.println("No has ingresado las credenciales.");
            break;
      }

      lectura.close();

    }
}