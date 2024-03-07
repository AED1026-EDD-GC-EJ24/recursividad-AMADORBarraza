package miPrincipal;



//heredamos de Criterio especializado en Alumno
public class CriterioAlumnoNombre  extends Criterio<Alumno>{
    
    // coloque el código para que compare nombre
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }

    

}
    

