import java.util.ArrayList;
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

    public List<Expediente> getExpedientes(){
        //Devuelve todos los expedientes que ha tenido un paciente

        return null;
    }

    public Expediente getExpedienteAbierto(){
        //Si tiene un expediente abierto, lo devuelve

        return null;
    }


}
