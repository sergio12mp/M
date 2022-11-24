import java.util.*;

public class Expediente {
    private Diagnostico diagnostico;
    private List<Acceso> listaAccesos;

    public Expediente(){
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, new Paciente());
    }

    public Expediente(Paciente paciente){
        assert paciente!=null;
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, paciente);
    }

    void addAcceso(Acceso acceso){
        assert acceso!=null;
        listaAccesos.add(acceso);
    }

    void rmAcceso(Acceso acceso){
        assert acceso!=null;
        listaAccesos.remove(acceso);
    }

    public Enumeration<Acceso> getAcceso(){
        return java.util.Collections.enumeration(listaAccesos);
    }
    
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }
   
    public void setDiagnostico(Diagnostico diagnostico) {
        assert diagnostico!=null;
        this.diagnostico = diagnostico;
    }
}
