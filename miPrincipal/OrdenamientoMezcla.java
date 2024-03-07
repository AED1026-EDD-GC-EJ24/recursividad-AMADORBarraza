package miPrincipal;

import java.util.Arrays;

//Coloque el código para que esta clase extienda de la interfaz Comparable
/*
 * Una interfaz define un contrato que una clase puede implementar. 
 * En este caso, la interfaz Comparable define un método compareTo 
 * que permite comparar dos objetos de la clase que implementa Comparable.  
 * La implementación del método compareTo determina el criterio de orden para los objetos.
 */
public class OrdenamientoMezcla <T <T> >{
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
        //coloque la llamada recursiva a ordener manando la mitad izquierda

        //coloque la llamada recursiva a ordener manando la mitad derecha
        
        //invoque al metodo mezclae

       
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