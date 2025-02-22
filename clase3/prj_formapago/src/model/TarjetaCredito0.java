
package model;


public class TarjetaCredito0 extends FormaPago {
    private int cantCuotas;
    private String nro_tarjeta;
    
    public TarjetaCredito0(double monto) {
        super("Tarjeta de crédito");
        cantCuotas = 1;
        nro_tarjeta = "";
        this.monto = monto;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }
    
    
    
}

