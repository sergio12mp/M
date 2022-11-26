import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private Expediente expediente;
    private Paciente paciente;

    public Diagnostico(Expediente expediente, Paciente profesional) {
        /* Para tener mas facilidad a la hora de encontrar errores en el codigo o modificar restricciones
       comprobaremos que los valores no sean null en los setters
        */
        setExpediente(expediente);
        setPaciente(profesional);
        profesional.addExpediente(this);
        expediente.setDiagnostico(this);
        profesional.setExpedienteAbierto(expediente);
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




