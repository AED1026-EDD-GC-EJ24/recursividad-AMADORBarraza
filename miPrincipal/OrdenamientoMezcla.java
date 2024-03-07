package miPrincipal;

import java.util.Arrays;

public class OrdenamientoMezcla <T extends Comparable<T> >{
    public OrdenamientoMezcla(){

    }
    public <T extends Comparable<T>> void ordenar(T[] arreglo) {
        if (arreglo.length <= 1) {
            return;
        }

        int mitad = arreglo.length / 2;
        T[] mitadIzquierda = Arrays.copyOf(arreglo, mitad);

        T[] mitadDerecha = Arrays.copyOfRange(arreglo, mitad, arreglo.length);
       

        for (int i = 0; i < mitad; i++) {
            mitadIzquierda[i] = arreglo[i];
        }

        for (int i = mitad; i < arreglo.length; i++) {
            mitadDerecha[i - mitad] = arreglo[i];
        }

        ordenar(mitadIzquierda);
        ordenar(mitadDerecha);

        mezclar(arreglo, mitadIzquierda, mitadDerecha);
    }

    private <T extends Comparable<T>> void mezclar(T[] arreglo, T[] mitadIzquierda, T[] mitadDerecha) {
        int i = 0, j = 0, k = 0;

        while (i < mitadIzquierda.length && j < mitadDerecha.length) {
            if (mitadIzquierda[i].compareTo(mitadDerecha[j]) < 0) {
                arreglo[k++] = mitadIzquierda[i++];
            } else {
                arreglo[k++] = mitadDerecha[j++];
            }
        }

        while (i < mitadIzquierda.length) {
            arreglo[k++] = mitadIzquierda[i++];
        }

        while (j < mitadDerecha.length) {
            arreglo[k++] = mitadDerecha[j++];
        }
    }

}