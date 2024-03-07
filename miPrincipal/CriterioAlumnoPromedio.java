package miPrincipal;

public class CriterioAlumnoPromedio extends Criterio<Alumno>{
    //coloque código para que compare promedios
    public int comparar(Alumno a, Alumno b) {
        double diff = a.getPromedio() - b.getPromedio();
        return diff>0 ? 1: diff<0 ? -1:0;
    }

    
}
