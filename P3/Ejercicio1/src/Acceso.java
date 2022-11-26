import java.util.Date;
import java.util.Enumeration;


public class Acceso {
    private Date fecha;
    TipoAcceso tipo;
    private Profesional profesional;
    private Expediente expediente;

    public Acceso(Date fecha,TipoAcceso  tipo, Profesional profesional, Expediente expediente){
       /* Para tener mas facilidad a la hora de encontrar errores en el codigo o modificar restricciones
       comprobaremos que los valores no sean null en los setters
        */
        setDate(fecha);
        setTipoAcceso(tipo);
        setProfesional(profesional);
        setExpediente(expediente);
        profesional.addAcceso(this);
        expediente.addAcceso(this);
    }

    private boolean noDups(Profesional p, Expediente e) {
        Enumeration<Acceso> enumA = p.getAcceso();
        boolean dupFound = false;
        while(!dupFound && enumA.hasMoreElements()){
            Acceso a = enumA.nextElement();
            if(a.getExpediente() == e){
                dupFound=true;
            }
            }
        return !dupFound;
    }
        
    //GETTERS
    public Date getDate(){
        return fecha;
    }

    public TipoAcceso getTipo(){
        return tipo;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public Profesional getProfesional(){
        return profesional;
    }

    //SETTERS
    public void setDate(Date nuevaFecha){
        assert(nuevaFecha!=null);
        fecha = nuevaFecha;
    }

    public void setTipoAcceso(TipoAcceso nuevoTipo){
        assert(nuevoTipo!=null);
        tipo = nuevoTipo;
    }

    public void setProfesional(Profesional profesional) {
        assert profesional!=null;
        this.profesional = profesional;
        }
    
    public void setExpediente(Expediente expediente) {
        assert expediente!=null;
        this.expediente = expediente;
     }
            
}
