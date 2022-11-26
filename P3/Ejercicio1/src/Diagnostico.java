import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private Expediente expediente;
    private Paciente paciente;

    public Diagnostico(Expediente e, Paciente p) {
        /* Para tener mas facilidad a la hora de encontrar errores en el codigo o modificar restricciones
       comprobaremos que los valores no sean null en los setters
        */
        setExpediente(e);
        setPaciente(p);
        p.addExpediente(this);
        e.setDiagnostico(this);
        p.setExpedienteAbierto(e);
    }

    void remove() {
        expediente.setDiagnostico(null);
        paciente.removeExpediente(this);
        setPaciente(null);
        setExpediente(null);
        assert expediente == null;
        assert paciente == null;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    private void setExpediente(Expediente expediente) {
        assert expediente != null;
        this.expediente = expediente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    private void setPaciente(Paciente paciente) {
        assert paciente != null;
        this.paciente = paciente;
    }
}




