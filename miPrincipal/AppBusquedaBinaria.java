package miPrincipal;
public class AppBusquedaBinaria{
    public static void menu(){
        System.out.println("******************************");
        System.out.println("***.   Búsqueda Binaria.   ***");
        System.out.println("******************************");
        int ele_bus = 85;
        int arreglo[]={10,20,25,30,35,40,45,50};
        System.out.println("Posición del elemento: " +busquedaBinariaIte(arreglo,ele_bus));
    }
    public static int busquedaBinariaIte(int []a, int ele){
        int li=0;
        int ld=a.length-1;
       while (ld>=ld)
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

    public static int busquedaBinariaRec(int [] a){
        return 0;
    }
}
