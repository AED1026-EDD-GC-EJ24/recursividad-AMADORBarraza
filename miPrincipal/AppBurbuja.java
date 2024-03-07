package miPrincipal;
public class AppBurbuja{
    public static void menu() {
        System.out.println("****************************+***");
        System.out.println("****  Ordenamiento Burbuja  ****");
        System.out.println("***************************+****");
        

        Alumno arr[]={new Alumno("Martin",25,90)
                     ,new Alumno("Carlos",23,70)
                     ,new Alumno("Anastacia",21,100)};
        System.out.println(arr[1].getId());
        System.out.println("Burbuja");
        OrdenamientoBurbuja ob = new OrdenamientoBurbuja<Alumno>();
        ob.ordenar_burbuja(arr, new CriterioAlumnoNombre());
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println();
    }
}