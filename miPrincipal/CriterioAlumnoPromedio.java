package miPrincipal;



public class CriterioAlumnoPromedio extends Criterio<Alumno>{
    
    public int comparar(Alumno a, Alumno b) {
        double diff = a.getPromedio() - b.getPromedio();
        return diff>0 ? 1: diff<0 ? -1:0;
    }

    
}
