import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private Expediente expediente;
    private Paciente paciente;

    public Diagnostico(Expediente e, Paciente p) {
        assert e != null;
        assert p != null;
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




