/*

6. VERIFICAR SUMA EN MATRIZ
• DESCRIPCIÓN:
Dada una matriz, verificar si la suma de los valores en la fila i-ésima es igual a la suma de los valores en la columna iésima
• IMPLEMENTACIÓN:
Generar una matriz de tamaño 4 x 4, llenarlo con valores capturados desde el teclado, entre 0 y 9.
o Imprimir la matriz:
• 1 2 3 6
• 9 5 3 1
• 0 3 5 6 
• 0 2 5 6
Verificar para cada fila y columna sí coinciden los promedios:
o Por ejemplo, para los datos de la matriz anterior, la segunda fila: 1 2 3 6, el promedio es 3, para la segunda
columna 2 5 3 2, el promedio también es 3, por lo que coinciden

 */
package eva1_examen_practico_6;

import java.util.Scanner;

public class EVA1_EXAMEN_PRACTICO_6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Leer la consola
        int iMatriz[][] = new int[4][4]; // La matriz con los valores
        for (int i = 0; i < iMatriz.length; i++) { // Valores para cada fila
            for (int j = 0; j < iMatriz[i].length; j++) { // Valores para cada columna 
                System.out.print("Introduce COLUMNA " + j + " para la FILA " + i + ": > ");
                iMatriz[i][j] = input.nextInt();
            }
        }
        // Imprimir la matriz
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < iMatriz[i].length; j++) {
                System.out.print("[" + iMatriz[i][j] +"]");
            }
            System.out.println("");
        }
        
        // sumar cada valor de cada fila
        int[] iaSumaFilas = new int[iMatriz.length]; // en este arreglo se almacenaran las
                                                    // diferentes sumas de las filas
        double daPromFila[] = new double[iaSumaFilas.length]; // En este arreglo se almacenaran las
                                                        // diferentes promedios de las filas
                                                        
        for (int i = 0; i < iaSumaFilas.length; i++) { // le damos valor cero a todos los elementos
                                                        // de los anteriores arreglos
            iaSumaFilas[i] = 0;
            daPromFila[i] = 0;
        }
        // Almacenamos las sumas en su correspondiente arreglo
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < iMatriz[i].length; j++) {
                iaSumaFilas[i] += iMatriz[i][j]; // Se sumaran 
            }
            // Calcular el promedio de cada suma de cada fila
            daPromFila[i] = (double)iaSumaFilas[i] / 4;
        }
        // Imprimir los promedios de cada fila
        System.out.println("Promedios de cada fila: ");
        for (int i = 0; i < daPromFila.length; i++) {
            System.out.println("[" + daPromFila[i] + "]");
        } System.out.println("");
        
        
        // sumar cada valor de cada COLUMNA
        int[] iaSumaColum = new int[iMatriz.length]; // en este arreglo se almacenaran las
                                                    // diferentes sumas de las columnas
        double daPromColum[] = new double[iaSumaColum.length]; // En este arreglo se almacenaran las
                                                        // diferentes promedios de las columnas
                                                        
        for (int i = 0; i < iaSumaColum.length; i++) { // le damos valor cero a todos los elementos
                                                        // de las anteriores columnas
            iaSumaColum[i] = 0;
            daPromColum[i] = 0;
        }
        // Almacenamos las sumas en su correspondiente arreglo
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < iMatriz[i].length; j++) {
                iaSumaColum[i] += iMatriz[j][i]; // Se sumaran 
            }
            // Calcular el promedio de cada suma de cada columna
            daPromColum[i] = (double)iaSumaColum[i] / 4;
        }
        // Imprimir los promedios de cada columna
        System.out.println("Promedios de cada columna: ");
        for (int i = 0; i < daPromColum.length; i++) {
            System.out.print("[" + daPromColum[i] + "]");
        } System.out.println("");
        
        // Ver coincidencias entre los promedios de las filas con las columnas
        for (int i = 0; i < daPromFila.length; i++) { // Pasamos por cada promedio de cada fila
            for (int j = 0; j < daPromColum.length; j++) { // Pasamos por cada promedio de cada columna
                if(daPromFila[i] == daPromColum[j]){ // Corroboramos si coinciden ambos promedios
                    // Imprimimos
                    System.out.println("La fila " + i + " coincide con la columna " + j);
                }
            }
        }
    }
}
