public class MedioPensionista extends Trabajador {
    private Pensionista pensionista;
    private Activo activo;

    public MedioPensionista(Pensionista pensionista, Activo activo) {
        super(pensionista.nombre, pensionista.numeroSeguridadSocial, pensionista.salario + activo.salario);
        this.pensionista = pensionista;
        this.activo = activo;

    }

    @Override
    public double nomina() {
        return getActivo().nomina() + getPensionista().nomina();
    }

    @Override
    public void incrementar() {
        getPensionista().incrementar();
        getActivo().incrementar();
        setSalario(nomina());
    }

    public Pensionista getPensionista() {
        return pensionista;
    }

    public void setPensionista(Pensionista pensionista) {
        this.pensionista = pensionista;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

}
// creamos mediopensionistas creando atributos en la clase mediopensionistas,
// pero es mas eficiente hacer
// que extienda de trabajdor