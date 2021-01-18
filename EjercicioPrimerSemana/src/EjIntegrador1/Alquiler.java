package EjIntegrador1;

public class Alquiler {
    private String nombreCliente;
    private int dniCliente;
    private int fechaIni;
    private int fechaFin;
    private int posAmarre;
    private Barco barco;
    
    public Alquiler(String nombreCliente, int dniCliente, int fechaIni, int fechaFin, int posAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.posAmarre = posAmarre;
        this.barco = barco;
    } 
    
    public int devolverCalculoAlquiler() {
        int numDiasOcupacion = this.fechaFin - this.fechaIni;
        int moduloBarco = this.barco.devolverModuloEspecial();
        int resultado = numDiasOcupacion * moduloBarco * 2;
        return resultado;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    public int getFechaIni() {
        return fechaIni;
    }
    public void setFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }
    
    public int getFechaFin () {
        return fechaFin;
    }
    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public int getPosAmarre() {
        return posAmarre;
    }
    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public String toString() {
        return "Alquiler{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dniCliente=" + dniCliente +
                ", fechaIni=" + fechaIni +
                ", fechaFin=" + fechaFin +
                ", posAmarre=" + posAmarre +
                ", barco=" + barco +
                ", calculo del alquiler = " + this.devolverCalculoAlquiler()+
                '}';
    }
}