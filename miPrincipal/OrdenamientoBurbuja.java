package miPrincipal;
public class OrdenamientoBurbuja<T>{
    public <T> void ordenar_burbuja(T[] arr, Criterio<T> cr) {
        boolean ordenado = false;
        while (!ordenado) {
           ordenado = true;
           for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
                if (cr.comparar(arr[i + 1], arr[i]) < 0) {
                    T aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    ordenado = false;
                }
            } 
        }
    }

}