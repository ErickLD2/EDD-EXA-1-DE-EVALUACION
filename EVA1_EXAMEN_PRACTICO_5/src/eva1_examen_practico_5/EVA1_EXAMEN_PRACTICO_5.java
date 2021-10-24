/*

5. ARREGLO CON POSICIONES PARES
• DESCRIPCIÓN:
    Generar una copia de un arreglo que tiene valores aleatorios.
• IMPLEMENTACIÓN:
    Generar un arreglo de tamaño 15, llenarlo con valores aleatorios entre 1 y 100.
    o En las posiciones PARES, SOLO deben almacenarse valores PARES, en las IMPARES puede haber TANTO pares 
        como impares.
    o Imprimir el arreglo: [0, 2, 10, 11, 8, 10, 30, 7, 66, 20, 6, 14, 92, 2, 12]

 */
package eva1_examen_practico_5;

public class EVA1_EXAMEN_PRACTICO_5 {
    
    public static void main(String[] args) {
        
        // Generar un arreglo con numeros aleatorios
        int aiArreglo[] = new int[15], iRandom;
        for (int i = 0; i < aiArreglo.length; i++) {
            // generamos el numero random entre 1 y 100
            iRandom = (int)(Math.random()*99) + 1;
            
            // comprobamos si estamos en una posicion
            if ((i%2 == 0) && (i!=0)) {
                if (iRandom%2==0) {
                    aiArreglo[i] = iRandom;
                    continue;
                }
                else{
                    i--;
                    continue;
                }
            }
            aiArreglo[i] = iRandom;
        }
        
        // Imprimimos el arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
    }
    
}
