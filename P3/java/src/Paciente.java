import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Paciente {

    private List<Diagnostico> listaExpedientes;
    private Expediente expedienteAbierto;


    Paciente(){
        listaExpedientes = new ArrayList<Diagnostico>();
    }

    void addExpediente(Diagnostico diagnostico){
        assert diagnostico != null;

        listaExpedientes.add(diagnostico);
    }
    
    void removeExpediente(Diagnostico diagnostico){
        assert diagnostico != null;

        listaExpedientes.remove(diagnostico);
    }

    public Enumeration<Diagnostico> getExpediente(){
        return java.util.Collections.enumeration(listaExpedientes);
        }
        

    public Expediente getExpedienteAbierto(){
        return expedienteAbierto;
    }

    void setExpedienteAbierto(Expediente expedienteAbierto) {
        this.expedienteAbierto = expedienteAbierto;
        }
    
    public void cerrarExpedienteAbierto() {
        this.expedienteAbierto = null;
        }
        


}
