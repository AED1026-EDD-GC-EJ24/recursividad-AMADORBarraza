package miPrincipal;


public class AppSeleccion {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void menu() {
        System.out.println("******************************");
        System.out.println("**  Ordenamiento Selección  **");
        System.out.println("******************************");
        System.out.println("Versión Iterativa");
        //Lo probamos con Integer
        Integer arreglo1[]={20,10,5,40,30,15};
        OrdenamientoSeleccion os = new OrdenamientoSeleccion<Integer>();
        os.ordenar_ite(arreglo1);

        for (int ele : arreglo1)
           System.out.println(ele);
        System.out.println();
    
        System.out.println("Versión Recursiva");
        Integer arreglo2[]={20,10,5,40,30,15};
        os.ordenar_rec(arreglo2,0,arreglo2.length-1);
        
        for (int ele : arreglo2)
           System.out.println(ele);
        System.out.println();
        System.out.println();
        //Lo probamoscon un arreglo de String
        String arreglo3[]= {"Beatriz","Zulema","Ana","Carlos","Felipe"};
        os.ordenar_rec(arreglo3,0,arreglo3.length-1);
        
        for (String ele: arreglo3)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        //Lo probamos con un arreglo de Alumnos
        Alumno arr[]={new Alumno("Martin",25,90)
                     ,new Alumno("Carlos",23,70)
                     ,new Alumno("Anastacia",21,100)};

        os.ordenar_rec(arr,0,arr.length-1);
        for (Alumno ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        
       
        
    }
    
    
}
