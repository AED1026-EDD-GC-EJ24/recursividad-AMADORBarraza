package miPrincipal;
public class OrdenamientoSeleccion{
    public OrdenamientoSeleccion(){
        
    }
    public  int[] ordenar_ite(int []a){
        int min;
        for (int i=0;i<a.length-1;i++){
           min =encontrarMinimo(a, i, a.length-1);
           intercambiar(a,i,min);
        }

        return a; 

    }
    public  int[] ordenar_rec(int []a, int li, int ld ){
       
        if (li==ld)
           return a;
        int min= encontrarMinimo(a,li,ld);
        intercambiar(a, li, min);
        return ordenar_rec(a,li+1,ld);
        

    }
    public  int encontrarMinimo(int[] a,int posInicial,int posFinal){
        int min = posInicial; //Consideramos que el menor esta en la posición inicial
        for (int i=posInicial+1;i<=posFinal;i++){
            if (a[i]<a[min]){
                min=i;
               
               
            }
        }
        return min;
        

    }
    public  void intercambiar(int []a,int pos, int minimo){
    
        int aux = a[pos];
        a[pos]=a[minimo];
        a[minimo] = aux;
    }
}