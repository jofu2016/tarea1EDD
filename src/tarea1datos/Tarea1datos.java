/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1datos;

import java.util.Random;

/**
 *
 * @author jofue
 */
public class Tarea1datos {

    public static void main(String[] args) {

         System.out.println("***** Suma De Diagonales ***** \n");
        int filas = 3;
        int columnas = 3;
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // Diag Izq a Der
        int sumaDiag1 = 0;
        for (int i = 0; i < filas; i++) {
            sumaDiag1 += matriz[i][i];
        }

        // Diag Der a Izq
        int sumaDiag2 = 0;
        for (int i = 0; i < filas; i++) {
            sumaDiag2 += matriz[i][filas - i - 1];
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print( "    " + matriz[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nLa suma total de la diagonal Izq a Der : " + sumaDiag1);
        System.out.println("La suma total de la diagonal Der a Izq : " + sumaDiag2);
    }

}
