import java.util.Date;
import java.util.Enumeration;


public class Acceso {
    private Date fecha;
    TipoAcceso tipo;
    private Profesional pro;
    private Expediente exp;

    public Acceso(Date fecha,TipoAcceso  tipo, Profesional pro, Expediente exp){
       /* Para tener mas facilidad a la hora de encontrar errores en el codigo o modificar restricciones
       comprobaremos que los valores no sean null en los setters
        */
        setDate(fecha);
        setTipoAcceso(tipo);
        setProfesional(pro);
        setExpediente(exp);
        pro.addAcceso(this);
        exp.addAcceso(this);
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
