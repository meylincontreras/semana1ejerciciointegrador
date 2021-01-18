package EjIntegrador1;

public class Deportivo extends Barco {
    private int potenciaCV;
    
    public Deportivo(String matricula, int eslora, int anio, int potenciaCV) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }
    
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public int devolverModuloEspecial() {
        int resultado = this.devolverModulo() + this.potenciaCV;
        return resultado;
    }
}