package P4.EJ2;

public abstract class Estado {

    public abstract void abrir(Biestable dispositivo);
    public abstract void cerrar(Biestable dispositivo);
    public abstract String estado(Biestable dispositivo);
}