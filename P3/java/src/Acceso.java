import java.util.Date;

public class Acceso {
    private Date fecha;
    TipoAcceso tipo;

    public Acceso(Date fecha,TipoAcceso  tipo){
        assert(fecha!=null);
        assert(tipo!=null);

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
