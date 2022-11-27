public abstract class Trabajador {

    public String nombre;
    
    public String numeroSeguridadSocial;
    protected double salario;

    public Trabajador(String nombre, String numeroSeguridadSocial, double salario){
        assert nombre!=null;
        assert numeroSeguridadSocial!=null;
        assert salario >=0;
        this.nombre = nombre;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }
  
    public double nomina(){
        return salario;
    } 
    public void incrementar(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert nombre!=null;
        this.nombre = nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        assert numeroSeguridadSocial!=null;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        assert salario >= 0;
        this.salario = salario;
    }

}
