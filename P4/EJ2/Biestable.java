package P4.EJ2;


public class Biestable {
    private Estado estado;
    
    public Biestable() {
    setEstado(new Rojo());
    
    }
    
    public void abrir() {
    estado.abrir(this);
    
    }
    
    public void cerrar() {
    estado.cerrar(this);
    
    }

    public String estado(){
        return estado.estado(this);
    }

    Estado getEstado() {
        return estado;
    }

    void setEstado(Estado estado) {
        assert estado != null;
        this.estado = estado;
    }

}