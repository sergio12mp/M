import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Profesional {

    private List<Acceso> listaAccesos;

    public Profesional(){
        listaAccesos = new ArrayList<Acceso>();   
    }

    void addAcceso(Acceso a){
        assert a!=null;
        listaAccesos.add(a);
    }

    void removeAcceso(Acceso a){
        assert a!=null;
        listaAccesos.remove(a);
    }

    public Enumeration<Acceso> getAcceso(){
        return java.util.Collections.enumeration(listaAccesos); //comentar que hemos usado esto porque evita la modificación
    }

}

