package miPrincipal;
public class AppMezcla {
   public static void menu() {
        System.out.println("****************************+***");
        System.out.println("**  Ordenamiento por Mezclas  **");
        System.out.println("***************************+****");

        System.out.println("Versión Recursiva");

        int[] array1 = {5, 2, 4, 6, 1, 3};

        ordenarPorMezclasIterativo(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
       

        System.out.println("Versión Recursiva");
        int[] array2 = {5, 2, 4, 6, 1, 3};

        ordenarPorMezclas(array2, 0, array2.length - 1);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        
    }
    private static void ordenarPorMezclasIterativo(int[] array) {
        int longitud = array.length;

        for (int tamanoSubarreglo = 1; tamanoSubarreglo < longitud; tamanoSubarreglo *= 2) {
            for (int inicioSubarreglo = 0; inicioSubarreglo < longitud; inicioSubarreglo += 2 * tamanoSubarreglo) {
                int mitadSubarreglo = Math.min(inicioSubarreglo + tamanoSubarreglo - 1, longitud - 1);
                int finSubarreglo = Math.min(inicioSubarreglo + 2 * tamanoSubarreglo - 1, longitud - 1);

                mezclar(array, inicioSubarreglo, mitadSubarreglo, finSubarreglo);
            }
        }
    }

    
    private static void ordenarPorMezclas(int[] array, int inicio, int fin) {
        if (fin <= inicio) {
            return;
        }

        int mitad = (inicio + fin) / 2;

        ordenarPorMezclas(array, inicio, mitad);
        ordenarPorMezclas(array, mitad + 1, fin);

        mezclar(array, inicio, mitad, fin);
    }

    private static void mezclar(int[] array, int inicio, int mitad, int fin) {
        int[] arrayAuxiliar = new int[fin - inicio + 1];

        int i = inicio;
        int j = mitad + 1;
        int k = 0;

        while (i <= mitad && j <= fin) {
            if (array[i] <= array[j]) {
                arrayAuxiliar[k] = array[i];
                i++;
            } else {
                arrayAuxiliar[k] = array[j];
                j++;
            }

            k++;
        }

        while (i <= mitad) {
            arrayAuxiliar[k] = array[i];
            i++;
            k++;
        }

        while (j <= fin) {
            arrayAuxiliar[k] = array[j];
            j++;
            k++;
        }

        for (int m = 0; m < arrayAuxiliar.length; m++) {
            array[inicio + m] = arrayAuxiliar[m];
        }
    }

    
}
