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
        paciente.rmExpediente(this);
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

public class Expediente {
    private List<Acceso> listaAccesos;
    private Diagnostico diagnostico;

    public Expediente() {
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, new Paciente());
    }

    public Expediente(Paciente p) {
        assert p != null;
        listaAccesos = new ArrayList<Acceso>();
        diagnostico = new Diagnostico(this, p);
    }

    void addAcceso(Acceso a) {
        assert a != null;
        listaAccesos.add(a);
    }

    void rmAcceso(Acceso a) {
        assert a != null;
        listaAccesos.remove(a);
    }

    public Enumeration<Acceso> getAcceso() {
        return java.util.Collections.enumeration(listaAccesos);
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        assert diagnostico != null;
        this.diagnostico = diagnostico;
    }
}


