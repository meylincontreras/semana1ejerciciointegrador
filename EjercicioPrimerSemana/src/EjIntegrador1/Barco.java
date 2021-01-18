package EjIntegrador1;

public abstract class Barco {
    private String matricula;
    private int esloraMetros;
    private int anio;
    
    public Barco(String matricula, int esloraMetros, int anio) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.anio = anio;
    }
    
    public abstract int devolverModuloEspecial();
    
    public int devolverModulo(){
        int resultado = this.esloraMetros *10;
        return resultado;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getEsloraMetros() {
        return esloraMetros;
    }
    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }
    
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", esloraMetros=" + esloraMetros +
                ", anio=" + anio +
                '}';
    }
}