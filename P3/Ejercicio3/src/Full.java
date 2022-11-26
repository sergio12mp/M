public class Full extends Estado {
    public Full(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza pieza) {
        assert pieza != null;
        assert size() < bandeja.getCapacidad();
        bandeja.piezas.add(pieza);
        pieza.setBandeja(bandeja);
    }

    @Override
    public Pieza get() {
        if (bandeja.getCapacidad() > 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Empty(bandeja));
        }

        Pieza pieza = bandeja.piezas.poll();
        pieza.setBandeja(null);
        return pieza;
    }

    @Override
    public String toString() {
        return "Full";
    }
}