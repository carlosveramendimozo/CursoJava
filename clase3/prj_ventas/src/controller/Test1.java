package controller;

public class Test1 {
    public static void main(String[] args) {
        Cliente clien1 = new Cliente("Juan", 1500);
        System.out.println(clien1);
        
        controller.ClienteNatural clienN1 = new controller.ClienteNatural("12345678", "ANA ABAD", 
                                           5000,"Av. Lima 123", "ana@gmail.com", 2015);
        System.out.println(clienN1);
        System.out.println("Antiguedad del cliente natural : " + clienN1.getAntiguedad() + " años");
        
        ClienteJuridico clienJ1 = new ClienteJuridico("20102030401", "Empresa ABC", "Av. Tupac Amaru 1010", 
                100000, "empabc@abc.com", 2020, "10020030", "José Perez");
        System.out.println(clienJ1);
        
    }
}