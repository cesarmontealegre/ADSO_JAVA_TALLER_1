package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoOcho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // Registrar los productos
        double totalCompra = 0;
        System.out.println("Ingrese los productos adquiridos y su precio: (Ingrese -1 para terminar)");
        String nombreProducto;
        double precioProducto;
        do {
            System.out.print("Nombre del producto: ");
            nombreProducto = sc.nextLine();
            if (nombreProducto.equals("-1")) {
                break;
            }
            System.out.print("Precio del producto: ");
            precioProducto = Double.parseDouble(sc.nextLine());
            totalCompra += precioProducto;
        } while (!nombreProducto.equals("-1"));

        // Comprobar si es beneficiado con el descuento
        boolean esBeneficiado = false;
        int descuento = 0;
        int bolita = r.nextInt(4); // 0: Roja, 1: Azul, 2: Amarilla, 3: Blanca
        switch (bolita) {
            case 0:
                esBeneficiado = true;
                descuento = 10;
                break;
            case 1:
                esBeneficiado = true;
                descuento = 30;
                break;
            case 2:
                esBeneficiado = true;
                descuento = 50;
                break;
            case 3:
                esBeneficiado = true;
                System.out.println("¡Felicidades! Ganaste tu compra gratis.");
                break;
        }

        // Calcular el valor final y mostrar al usuario
        if (esBeneficiado) {
            double descuentoAplicado = totalCompra * descuento / 100.0;
            double totalConDescuento = totalCompra - descuentoAplicado;
            System.out.printf("¡Felicidades! Ganaste un descuento del %d%% en tu compra.\n", descuento);
            System.out.printf("El valor a pagar con descuento es: %.2f\n", totalConDescuento);
            System.out.print("Ingrese el valor con el que pagará: ");
            double pago = Double.parseDouble(sc.nextLine());
            double cambio = pago - totalConDescuento;
            System.out.printf("Su cambio es: %.2f\n", cambio);
        } else {
            System.out.println("Lo siento, no ganaste ningún descuento.");
            System.out.printf("El valor a pagar es: %.2f\n", totalCompra);
            System.out.print("Ingrese el valor con el que pagará: ");
            double pago = Double.parseDouble(sc.nextLine());
            double cambio = pago - totalCompra;
            System.out.printf("Su cambio es: %.2f\n", cambio);
        }
        sc.close();
    }

}

