import java.util.Date;
import java.util.Enumeration;

public class Acceso {
    private Date fecha;
    TipoAcceso tipo;

    public Acceso(Date fecha,TipoAcceso  tipo){
        this.fecha = fecha;
        this.tipo = tipo;
    }

    //GETTERS
    public Date getDate(){
        return fecha;
    }

    public TipoAcceso getTipo(){
        return tipo;
    }

    //SETTERS
    public void setDate(Date nuevaFecha){
        fecha = nuevaFecha;
    }

    public void setTipoAcceso(TipoAcceso nuevoTipo){
        tipo = nuevoTipo;
    }
}
