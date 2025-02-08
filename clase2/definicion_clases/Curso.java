
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    private int codigo_curso;
    private String nombre;
    private String fecha_inicio;
    
    //metodos
    public void registrarcurso(int cod, String nom, String fec_in){
        codigo_curso = cod;
        nombre = nom;
        fecha_inicio = fec_in;
    }
    
    public void mostrar(){
        System.out.println("Codigo del curso            :" + codigo_curso);
        System.out.println("Nombre del curso            :" + nombre);
        System.out.println("fecha de inicio             :" + fecha_inicio);
    }
    
    public void modificarFechaInicio(String nuevaFecha){
        fecha_inicio = nuevaFecha;
    }
}
