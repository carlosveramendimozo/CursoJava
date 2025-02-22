package controller;

class PlatoRestaurante extends Producto { 
    
    protected String plato; 
    protected double precio; 
    private int calorias;


public PlatoRestaurante(String nombre, double precio, String descripcion, int calorias)
{
    super("las calorias del plato son: ");
    this.calorias = calorias;

}

public int getCalorias() 
{
    return calorias;
}

public void setCalorias(int calorias) 
{
    this.calorias = calorias;
}
}