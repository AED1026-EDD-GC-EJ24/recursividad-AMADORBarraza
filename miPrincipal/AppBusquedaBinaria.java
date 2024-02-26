package miPrincipal;
public class AppBusquedaBinaria{
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***.   Búsqueda Binaria.   ***");
        System.out.println("******************************");
        int ele_bus = 45;
        int arreglo[]={10,20,25,30,35,40,45,50};
        System.out.println("Busqueda Binario Iterativa");
        System.out.println("Posición del elemento: " +busquedaBinariaIte(arreglo,ele_bus));
        System.out.println("Busqueda Binario Recursiva");
        System.out.println("Posición del elemento: " +busquedaBinariaRec(arreglo,ele_bus,0,arreglo.length-1));
        ele_bus = 51;
        System.out.println("Posición del elemento: " +busquedaBinariaRec(arreglo,ele_bus,0,arreglo.length-1));
        ele_bus = 1;
        System.out.println("Posición del elemento: " +busquedaBinariaRec(arreglo,ele_bus,0,arreglo.length-1));
    }
    public static int busquedaBinariaIte(int []a, int ele){
        int li=0;
        int ld=a.length-1;
       while (ld>=li)
        {
            int pos = (li+ld)/2;
            if(a[pos]==ele)
              return pos;
            else if(ele>a[pos])
               li=pos+1;
            else
               ld=pos-1;

        }
        return -1;

    }

    public static int busquedaBinariaRec(int [] a,int ele, int li,int ld){
        int pos = (li+ld)/2;
        if (li>ld){
           return -1;
        }
        else if (ele == a[pos]){
            return pos;
        }
        else if (ele>a[pos]){
            return busquedaBinariaRec(a,ele,li+1,ld);
        }
        else{
            return busquedaBinariaRec(a,ele,li,pos-1);
        }



        
    }
}
