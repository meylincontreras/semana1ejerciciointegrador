package EjIntegrador1;

public class Velero extends Barco {
    private int numMastiles;

    public Velero(String matricula, int eslora, int anio, int numMastiles){
        super(matricula, eslora, anio);
        this.numMastiles = numMastiles;
    }
    
    public int getNumMastiles() {
        return numMastiles;
    }
    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.numMastiles;
        return resultado;
    }
}