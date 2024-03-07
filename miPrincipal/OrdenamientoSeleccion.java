package miPrincipal;


public class OrdenamientoSeleccion <T extends Comparable<T>> {
    public OrdenamientoSeleccion(){
        
    }
    
    public  T[] ordenar_ite(T []a){
        int min;
        for (int i=0;i<a.length-1;i++){
           min =encontrarMinimo(a, i, a.length-1);
           intercambiar(a,i,min);
        }

        return a; 

    }
    
    public  T[] ordenar_rec(T []a, int li, int ld ){
       
        if (li==ld)
           return a;
        int min= encontrarMinimo(a,li,ld);
        intercambiar(a, li, min);
        return ordenar_rec(a,li+1,ld);
        

    }
    
    //Regresa la posición del mínimo
    public  int encontrarMinimo(T[] a,int posInicial,int posFinal){
        int min = posInicial; //Consideramos que el menor esta en la posición inicial
        for (int i=posInicial+1;i<=posFinal;i++){
            
            if ((a[i].compareTo(a[min])) <0 ){
            
            //if (a[i]<a[min]){
                min=i;
               
               
            }
        }
        return min;
        

    }
    public  void intercambiar(T []a,int pos, int minimo){
    
        T aux = a[pos];
        a[pos]=a[minimo];
        a[minimo] = aux;
    }
}