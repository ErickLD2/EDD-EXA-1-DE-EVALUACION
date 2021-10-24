/*

2. COMPARAR ARREGLOS
        • DESCRIPCIÓN:
    Capturar valores en arreglos y comparar.
        • IMPLEMENTACIÓN:
            o Generar dos arreglos de tamaño 10.
            o Solicitar valores al usuario para ambos arreglos
            o Imprimir ambos arreglos.
            o Indicar si los arreglos son iguales. Para determinar si son iguales, ambos arreglos deben tener los mismos 
                 valores, almacenados en la misma posición:
            o Arreglo 1: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
            o Arreglo 2: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
                • Ambos arreglos son iguales
            o Arreglo 1: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
            o Arreglo 2: [30, 45, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
                • Los arreglos no son iguales.

*/
package eva1_examen_practico_2;

import java.util.Scanner;

public class EVA1_EXAMEN_PRACTICO_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] aiArreglo1 = new int[10], aiArreglo2 = new int[10];
        
        // Ingresar los valores para ambos arreglos
        System.out.println("Se le pedira que introduzca valores para un par de arreglos");
        for (int i = 0; i < aiArreglo1.length; i++) {
            System.out.print("Valor " + i + " para el arreglo 1: ");
            aiArreglo1[i] = input.nextInt();
        }
        for (int i = 0; i < aiArreglo2.length; i++) {
            System.out.print("Valor " + i + " para el arreglo 2: ");
            aiArreglo2[i] = input.nextInt();
        }
        
        // Imprimir ambos arreglos
        System.out.print("Valores del arreglo 1: ");
        for (int i = 0; i < aiArreglo1.length; i++) {
            System.out.print("[" + aiArreglo1[i] + "]");
        } System.out.println("");
        
        System.out.print("Valores del arreglo 2: ");
        for (int i = 0; i < aiArreglo2.length; i++) {
            System.out.print("[" + aiArreglo2[i] + "]");
        } System.out.println("");
        
        
        // Comparar ambos arreglos
        String strComparacion = "IGUALES";
        for (int i = 0; i < aiArreglo1.length; i++) {
            if (aiArreglo1[i] != aiArreglo2[i]) {
                strComparacion = "DESIGUALES";
                break;
            }
        }
        System.out.println("Ambos arreglos son " + strComparacion + " entre si.");
    }
    
}
