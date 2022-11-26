public class Empty extends Estado {
    public Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza pieza) {
        assert pieza != null;
        if (bandeja.getCapacidad() > 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.add(pieza);
        pieza.setBandeja(bandeja);
    }

    @Override
    public Pieza get() {
        assert size() > 0;
        Pieza pieza = bandeja.piezas.poll();
        pieza.setBandeja(null);
        return pieza;
    }

    @Override
    public String toString() {
        return "Empty";
    }
}
