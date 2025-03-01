
package controller;
import model.*;

public class Test1 {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("12345","75048468","CHICHO SANCHEZ");
        System.out.println(p1);
        
        Conductor c1 = new Conductor("56789","75048468","TITO CALDERON");
        System.out.println(c1);
        
        Viaje v1 = new Viaje("54321", "SMP", "SAN ISIDRO",p1,c1);
        System.out.println(v1);
}
}