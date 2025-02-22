
package controller;
import model.*;


public class Test {
    
    static void pagar(FormaPago pago) {
        System.out.println("Forma de pago : " + pago);
        if(pago instanceof TarjetaCredito0) {
            System.out.println("Pedir el número de tarjeta y número de cuotas");
        } else if(pago instanceof Yape) {
            System.out.println("Indicar número de teléfono");
        }
    }

    public static void main(String[] args) {
       
        FormaPago pago1 = new Efectivo(150);
        pagar(pago1);
        
        pago1 = new TarjetaCredito0(529.90);
        pagar(pago1);
        
        pago1 = new Yape(2.5);
        pagar(pago1);
    }
}
