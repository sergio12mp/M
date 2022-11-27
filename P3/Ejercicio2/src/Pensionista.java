

public class Pensionista extends Trabajador{
    public Pensionista(String nombre, String numeroSeguridadSocial, Double salario){
        super(nombre,numeroSeguridadSocial,salario);
    }
    public void incrementar(){
        salario *= 1.04;
    }
}
