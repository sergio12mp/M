public class Trabajador {

    public String nombre;
    public String numeroSeguridadSocial;
    protected double salario;
    public Trabajador(String nombre, String numeroSeguridadSocial, double Salario){
        this.nombre = nombre;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }
    public double nomina(){
        double nomina = salario;
        return nomina;
    } 
    public void incrementar(){

    }
    
}
