/*

4. BUSCAR EL PRIMER ELEMENTO REPETIDO TRES VECES
• DESCRIPCIÓN: Buscar en un arreglo el primer valor que tenga un triplicado entre los valores del arreglo.

• IMPLEMENTACIÓN:
    Generar un arreglo de tamaño 20, llenarlo con valores aleatorios entre 1 y 20.
    o Imprimir el arreglo: [1, 2, 10, 11, 8, 10, 10, 10, 9, 2, 6, 14, 5, 2, 12]
    o Buscar el primer número que esté repetido en el arreglo (en el arreglo de ejemplo, el 2 es el primer número 
        que tiene un triplicado en el arreglo, el 10 también está triplicado, pero apareció después)
        • Imprimir el valor.

*/
package eva1_examen_practico_4;

public class EVA1_EXAMEN_PRACTICO_4 {
    
    public static void main(String[] args) {
        
        // Generar un arreglo con valores aleatorios repetidos
        int aiArreglo[] = new int[20], iRandom;
        for (int i = 0; i < aiArreglo.length; i++) {
            iRandom = (int)(Math.random()*19) + 1;
            aiArreglo[i] = iRandom;
        }
        
        // Imprimir los valores del arreglo
        System.out.println("Valores del arreglo: ");
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        } System.out.println("");
        
        // Saber cuales valores estan repetidos 
        int aiContArray[] = new int[aiArreglo.length];
        for (int i = 0; i < aiContArray.length; i++) {
            aiContArray[i] = 0;
        }
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo.length; j++) {
                if (i!=j) {
                    if (aiArreglo[i] == j) {
                        aiContArray[aiArreglo[i] - 1]++;
                    }
                }
            }
        }
        /*
        System.out.println("Valores repetidos del arreglo anterior");
        for (int i = 0; i < aiContArray.length; i++) {
            System.out.println(i + " - " + aiContArray[i]);
        }
*/
        String strValorRep = "";
        for (int i = 0; i < aiContArray.length; i++) {
            if (aiContArray[i] == 3) {
                strValorRep = "El valor " + (i + 1) + " fue el primero en repetirse 3 veces";
                break;
            }
            else{
                strValorRep = "Ningun valor fue repetido";
            }
        }
        System.out.println(strValorRep);
    }
    
}
