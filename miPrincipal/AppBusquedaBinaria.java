package miPrincipal;

import java.util.Scanner;

public class AppBusquedaBinaria{
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***.   Búsqueda Binaria.   ***");
        System.out.println("******************************");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el termino a buscar");
        int termino = entrada.nextInt();
        
        System.out.println("Ingrese cuantos elementos del arreglo seran: ");
        int n = entrada.nextInt();
        int arreglo[] = new int[n];
        for(int i=0; i<n; i++) 
        	arreglo[i] = entrada.nextInt();
        
        int i = busquedaBinariaIte(termino, arreglo);
        System.out.println("Busqueda iterativa");
        System.out.println("El termino "+termino+" esta en la posicion "+i);
        
        int j = busquedaBinariaIte(termino, arreglo);
        System.out.println("Busqueda Recursiva");
        System.out.println("El termino "+termino+" esta en la posicion "+j);
        
        
    }
    //coloque aquí el código faltabte
    public static int busquedaBinariaIte(int objetivo, int[] arreglo  ){
    	int izq = 0;
        int der = arreglo.length - 1;

        while (izq <= der) {
            int mitad = izq + (der - izq) / 2;
            if (arreglo[mitad] == objetivo) {
                return mitad;
            } else if (arreglo[mitad] < objetivo) {
                izq = mitad + 1;
            } else {
                der = mitad - 1;
            }
        }
        return -1;
    }
    //coloque aquí el código faltante
    public static int buquedaBinariaRec(int objetivo, int[] arreglo) {
    	return busquedaBinariaRec(arreglo, objetivo, 0, arreglo.length-1);
    }
    public static int busquedaBinariaRec(int[] arreglo, int objetivo, int izq, int der) {
            if (izq <= der) {
                int mitad = izq + (der - izq) / 2;
                if (arreglo[mitad] == objetivo) {
                    return mitad;
                } else if (arreglo[mitad] < objetivo) {
                    return busquedaBinariaRec(arreglo, objetivo, mitad + 1, der);
                } else {
                    return busquedaBinariaRec(arreglo, objetivo, izq, mitad - 1);
                }
            }
            return -1;        
    }
}
