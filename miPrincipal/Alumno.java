package miPrincipal;

//Implemente la clase como Comparable para poder ordenar Alumnos
public class Alumno implements  Identificable<String>{
    private String nombre;
    private int edad;
    private double promedio;
    //Constructor
    public Alumno(String nom, int e, double p){
        this.nombre = nom;
        this.edad = e;
        this.promedio = p;
    }
    //Metodo heredado para la interfaz Comparable
    
    public int compareTo(Object o){
        return this.toString().compareTo(o.toString());
    }
    //complete el método toString
    @Override
    public String toString(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setFecha(int e){
        this.edad = e;
    }
    public void setPromedio(double p){
        this.promedio = p;
    }
    public String getNombre(){

        return nombre;
    }
    public int getEdad(){

        return edad;
    }
    public double getPromedio(){

        return promedio;
    }
    @Override
    public String getId(){

        return nombre;
    }
    @Override
    public void setId(String n){
        this.nombre = n;
        

    }





}
