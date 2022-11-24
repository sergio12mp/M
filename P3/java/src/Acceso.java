import java.util.Date;

public class Acceso {
    private Date fecha;
    TipoAcceso tipo;
    private Profesional pro;
    private Expediente exp;

    public Acceso(Date fecha,TipoAcceso  tipo, Profesional pro, Expediente exp){
        assert(fecha!=null);
        assert(tipo!=null);
        assert(exp!=null);
        assert(pro!=null);

        setDate(fecha);
        setTipoAcceso(tipo);
        setProfesional(pro);
        setExpediente(exp);
    }

    //GETTERS
    public Date getDate(){
        return fecha;
    }

    public TipoAcceso getTipo(){
        return tipo;
    }

    public Expediente getExpediente() {
        return exp;
    }

    public Profesional getProfesional(){
        return pro;
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

    public void setProfesional(Profesional pro) {
        assert pro!=null;
        this.pro = pro;
        }
    
    public void setExpediente(Expediente exp) {
        assert exp!=null;
        this.exp = exp;
     }
            
}
