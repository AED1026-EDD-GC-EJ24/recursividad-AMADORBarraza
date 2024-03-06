package miPrincipal;


public class AppSeleccion {
    public static void menu() {
        System.out.println("******************************");
        System.out.println("**  Ordenamiento Selección  **");
        System.out.println("******************************");
        System.out.println("Versión Iterativa");
        int arreglo1[]={20,10,5,40,30,15};
        OrdenamientoSeleccion os = new OrdenamientoSeleccion();
        os.ordenar_ite(arreglo1);
        
        for (int ele : arreglo1)
           System.out.println(ele);
    
        System.out.println("Versión Recursiva");
        int arreglo2[]={20,10,5,40,30,15};
        os.ordenar_rec(arreglo2,0,arreglo2.length-1);
        
        for (int ele : arreglo2)
           System.out.println(ele);
        
    }
    
    
}
