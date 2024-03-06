package miPrincipal;



//heredamos de Criterio especializado en Alumno
public class CriterioAlumnoNombre  extends Criterio<Alumno>{
    
    
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }

    

}
    

