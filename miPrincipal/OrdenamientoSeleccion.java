package miPrincipal;

public class OrdenamientoSeleccion <T extends Comparable<T>> {
    public OrdenamientoSeleccion(){
        
    }
    
    public  T[] ordenar_ite(T []a){
        int min;
        for (int i=0;i<a.length-1;i++){
           //coloque el código para que encuentre el mínimo
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
        int min = 
        return min;
        
    }
    //coloque el código para que lleve el menor a su posición
    public  void intercambiar(T []a,int pos, int minimo){
    
       
    }
}