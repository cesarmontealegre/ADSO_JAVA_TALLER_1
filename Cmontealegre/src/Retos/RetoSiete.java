package Retos;

import java.util.Random;

public class RetoSiete {
    public static void main(String[] args) {
        Random random = new Random();
        int bola = random.nextInt(4); // 0 = roja, 1 = azul, 2 = amarilla, 3 = blanca
        double descuento = 0.0;
        String colorBola = "";

        switch (bola) {
            case 0:
                descuento = 0.1;
                colorBola = "roja";
                break;
            case 1:
                descuento = 0.3;
                colorBola = "azul";
                break;
            case 2:
                descuento = 0.5;
                colorBola = "amarilla";
                break;
            case 3:
                descuento = 1.0;
                colorBola = "blanca";
                break;
            default:
                System.out.println("Error en el sorteo");
                break;
        }

        double totalCompra = 80000; // ejemplo, se puede cambiar
        double descuentoFinal = totalCompra * descuento;
        double totalAPagar = totalCompra - descuentoFinal;

        System.out.println("Ha sacado la bola " + colorBola);
        if (descuento == 1.0) {
            System.out.println("¡Felicidades! Tu compra es gratis");
        } else {
            System.out.println("¡Felicitaciones! Has ganado un descuento del " + (descuento * 100) + "%");
            System.out.println("Valor a pagar con descuento: $" + totalAPagar);
        }
    }
}

