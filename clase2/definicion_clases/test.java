
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String x[]) {
        //Definicion/creacion del objeto
        //nombre_clase nombre_objeto;
        Alumno alum1;
        
        //inicializar el objeto(darle un espacio en memoria)
        //opcionalmente darles valores uniciales
        alum1 = null; // es nada( no tiene espacio en la memoria)
        
        //...muchas lineas adelante recien se requiere llenar
        alum1 = new Alumno(); // asignar espacio de memoria
        
        //recien se puede usar el objeto alum1
        alum1.registrarAlumno(12345,"Tello","Angie",4);
        // mostrar los datos
        alum1.mostrarCarnet();
        //system.out.println(alum1.nombre) -ponerlo en publico-
    }
}
