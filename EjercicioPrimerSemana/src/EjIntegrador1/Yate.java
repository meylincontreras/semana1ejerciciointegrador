package EjIntegrador1;

public class Yate extends Barco {
    private int potenciaCV;
    private int numCamarotes;
    
    public Yate(String matricula, int eslora, int anio, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }
    
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    public int getNumCamarotes() {
        return numCamarotes;
    }
    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.potenciaCV + this.numCamarotes;
        return resultado;
    }
}
