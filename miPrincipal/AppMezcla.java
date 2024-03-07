package miPrincipal;


public class AppMezcla {
   @SuppressWarnings("unchecked")
public static void menu() {
        System.out.println("****************************+***");
        System.out.println("**  Ordenamiento por Mezclas  **");
        System.out.println("***************************+****");
        


        /*
        Alumno arr[]={new Alumno("Martin",25,90)
                     ,new Alumno("Carlos",23,70)
                     ,new Alumno("Anastacia",21,100)};
        System.out.println(arr[1].getId());
        System.out.println("Burbuja");
        Util.ordenar_burbuja(arr, new CriterioAlumnoNombre());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        
        }
        */
        System.out.println("Versión Recursiva");
        Integer arreglo[]={20,10,5,40,30,15};
        @SuppressWarnings("rawtypes")
        OrdenamientoMezcla om = new OrdenamientoMezcla<Integer>();  
        
        om.ordenar(arreglo);
        for (Integer ele: arreglo)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        
    }
    
  
}
