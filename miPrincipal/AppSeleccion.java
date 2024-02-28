package miPrincipal;


public class AppSeleccion {
    public static void menu() {
        System.out.println("******************************");
        System.out.println("**  Ordenamiento Selección  **");
        System.out.println("******************************");
        System.out.println("Versión Iterativa");
        int arreglo1[]={20,10,5,40,30,15};
        ordenar_ite(arreglo1);
        for (int ele : arreglo1)
           System.out.println(ele);

        System.out.println("Versión Recursiva");
        int arreglo2[]={20,10,5,40,30,15};
        ordenar_rec(arreglo2,0,arreglo2.length-1);
        for (int ele : arreglo2)
           System.out.println(ele);
        
    }
    public static int[] ordenar_ite(int []a){
        int min;
        for (int i=0;i<a.length-1;i++){
           min =encontrarMinimo(a, i, a.length-1);
           intercambiar(a,i,min);
        }

        return a; 

    }
    public static int[] ordenar_rec(int []a, int li, int ld ){
        if (li==ld)
           return a;
        int min= encontrarMinimo(a,li,ld);
        intercambiar(a, li, min);
        return ordenar_rec(a,li+1,ld);
        

    }
    public static int encontrarMinimo(int[] a,int posInicial,int posFinal){
        int min = posInicial; //Consideramos que el menor esta en la posición inicial
        for (int i=posInicial+1;i<=posFinal;i++){
            if (a[i]<a[min]){
                min=i;
               
               
            }
        }
        return min;
        

    }
    public static void intercambiar(int []a,int pos, int minimo){
        int aux = a[pos];
        a[pos]=a[minimo];
        a[minimo] = aux;
    }
    
}
