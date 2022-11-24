import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

public class Bandeja {
    private Estado estado;
    private int capacidad;
    Queue<Pieza> piezas;

    public Bandeja(int cap) {
        assert cap > 0;
        estado = new Empty(this);
        setCapacidad(cap);
        setPiezas(new LinkedList<>());
    }

    public void put(Pieza p) {
        estado.put(p);
    }

    public Pieza get() {
        return estado.get();
    }

    public Integer size() {
        return estado.size();
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad(int capacidad) {
        assert capacidad > 0;
        this.capacidad = capacidad;
    }

    public Enumeration<Pieza> getPiezas() {
        return java.util.Collections.enumeration(piezas);
    }

    void setPiezas(Queue<Pieza> piezas) {
        assert piezas != null;
        this.piezas = piezas;
    }

    public Estado getEstado() {
        return estado;
    }

    void setEstado(Estado estado) {
        assert estado != null;
        this.estado = estado;
    }
}




