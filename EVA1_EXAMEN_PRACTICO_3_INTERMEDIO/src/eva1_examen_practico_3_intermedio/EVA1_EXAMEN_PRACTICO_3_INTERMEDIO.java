/*

3. CONTEO
    • DESCRIPCIÓN: Contar la cantidad de duplicados para cada elemento del arreglo.

    • IMPLEMENTACIÓN:
        o Generar un arreglo de tamaño 15 y llenarlo con valores aleatorios entre 1 y 100.
            • Imprimir el arreglo: [1, 2, 10, 11, 8, 10, 5, 7, 9, 20, 6, 14, 5, 2, 12]
        o Generar una matriz con las siguientes dimensiones:
            • FILAS  Una fila, para cada elemento diferente del arreglo.
            • COLUMNAS  2 Columnas:
                • [Valor único del arreglo][Cantidad de veces que se repite]
            • Imprimir la matriz:

 */
package eva1_examen_practico_3_intermedio;

public class EVA1_EXAMEN_PRACTICO_3_INTERMEDIO {
    
    public static void main(String[] args) {
        int iaArreglo[] = new int[15]; // creamos el arreglo de valores
        int imMatriz[][] = new  int[iaArreglo.length][2]; // creamos la matriz de valores y repeticiones
        int iRandom; // variable para generar randoms values
        // Generamos los valores randoms
        for (int i = 0; i < iaArreglo.length; i++) {
            iRandom = (int)(Math.random()*99) + 1;
            iaArreglo[i] = iRandom; // Agregamos los valores al arreglo
        }
        // Imprimir los valores del arreglo
        System.out.println("Arreglo con valores random: ");
        for (int i = 0; i < iaArreglo.length; i++) {
            System.out.print("[" + iaArreglo[i] + "]");
        } System.out.println("");
        
        // Comprobar las repeticiones de cada valor del arreglo
        int iaConteo[] = new int[100];
        for (int i = 0; i < 100; i++) {
            iaConteo[i] = 0;
        }
        for (int i = 0; i < iaArreglo.length; i++) {
            for (int j = 1; j < 101; j++) {
                if(iaArreglo[i]==j){
                    iaConteo[iaArreglo[i] - 1]++;
                }
            }
        }
        System.out.println("Cantidad de repeticiones de cada valor del arreglo: ");
        for (int i = 0; i < iaArreglo.length; i++) {
            imMatriz[i][0] = iaArreglo[i];
            imMatriz[i][1] = iaConteo[iaArreglo[i] - 1];
        }
        System.out.println("Valor || cantidad");
        for (int i = 0; i < iaArreglo.length; i++) {
            System.out.println("[" + imMatriz[i][0] + "] [" + imMatriz[i][1] + "]");
        }
    }
    
}
