/*

3. COMPARAR ARREGLOS SIMILARES
• DESCRIPCIÓN: Capturar valores en arreglos y comparar.

• IMPLEMENTACIÓN:
    o Generar dos arreglos de tamaño 10.
    o Solicitar valores al usuario para ambos arreglos (para facilitar las cosas, cuando haga pruebas, no capture 
        duplicados, solo valores diferentes)
    o Imprimir ambos arreglos.
    o Indicar si los arreglos son similares. Para determinar si son similares, ambos arreglos deben tener los mismos 
        valores, aunque no estén en las misas posiciones:
    o Arreglo 1: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
    o Arreglo 2: [12, 5, 9, 20, 5, 10, 8, 14, 10, 11, 7, 6, 2, 3, 1]
        >Ambos arreglos son similares
    o Arreglo 1: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 3, 12]
    o Arreglo 2: [13, 45, 9, 20, 5, 10, 8, 14, 63, 11, 7, 6, 2, 3, 1]
        >Los arreglos no son iguales.

 */
package eva1_examen_practico_3;

import java.util.Arrays;
import java.util.Scanner;

public class EVA1_EXAMEN_PRACTICO_3 {
    
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
        
        // Comparar cada valor de ambos arreglos
        Arrays.sort(aiArreglo1); // Ordenamos ambos arreglos para facilitar la comparacion
        Arrays.sort(aiArreglo2);
        
        String strComparacion = "SIMILARES";
        for (int i = 0; i < aiArreglo1.length; i++) {
            if (aiArreglo1[i] != aiArreglo2[i]) {
                strComparacion = "DIFERENTES";
                break;
            }
        }
        System.out.println("Ambos arreglos son " + strComparacion + " entre si.");
        
        
    }
    
}
