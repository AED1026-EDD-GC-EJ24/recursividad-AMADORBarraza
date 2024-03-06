package miPrincipal;
import java.util.List;

public class UtilListas{
    public static void mostrarLista(List<?> lista) {
        for(Object x: lista){
            System.out.println(x);
        }

        
    }
    public static void mostrarListaDeAlumno(List<? extends Alumno> laLista){
        for(Alumno a: laLista){
            System.out.println(a.getNombre());

        }

    }
    

}