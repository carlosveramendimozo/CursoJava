
/**
 * Write a description of class Test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2
{
   public static void main(String x[]) {
        Curso cur1;

        cur1 = null;
        
      
        cur1 = new Curso();
        
 
        cur1.registrarcurso(54321,"Java programación","01/02/2025");
        
        cur1.mostrar();
        
        cur1.modificarFechaInicio("05/01/2025");
        
        cur1.mostrar();
        
    }
}
