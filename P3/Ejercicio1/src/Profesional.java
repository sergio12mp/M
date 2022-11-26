import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Profesional {

    private List<Acceso> listaAccesos;
    public enum TipoAcceso{consulta,modificacion,creacion,archivo};

    public Profesional(){
        listaAccesos = new ArrayList<Acceso>();   
    }

    void addAcceso(Acceso acceso){
        assert acceso!=null;
        listaAccesos.add(acceso);
    }

    void removeAcceso(Acceso acceso){
        assert acceso!=null;
        listaAccesos.remove(acceso);
    }

    public Enumeration<Acceso> getAcceso(){
        return java.util.Collections.enumeration(listaAccesos); 
    }

}

