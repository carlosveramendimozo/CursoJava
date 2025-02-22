
package controller;

public class Test2 {
    
    public static void main(String[]args){
        Cliente clil;
        
        clil = new ClienteNatural("10203040","ABEL ABAD",2000);
        
        //determinar el tipo de cliente que es clil
        if(clil instanceof ClienteJuridico){
            System.out.println("clil es un tipo de ClienteJuridico");
        }
        else{
            System.out.println("clil es un tipo de ClienteNatural");
        }
    }
    
}
