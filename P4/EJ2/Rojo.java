package P4.EJ2;

public class Rojo extends Estado{
    @Override
    public void abrir(Biestable dispositivo) {
        assert dispositivo != null;
        dispositivo.setEstado(new Verde());
    }
    
    @Override
    
    public void cerrar(Biestable dispositivo) {
        assert dispositivo != null;
        throw new RuntimeException();
    }
    
    @Override
    public String estado(Biestable dispositivo) {
        assert dispositivo != null;
        return "cerrado";
    }
}