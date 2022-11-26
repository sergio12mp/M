public class Normal extends Estado {
    public Normal(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza pieza) {
        assert pieza != null;
        if (size() < bandeja.getCapacidad() - 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Full(bandeja));
        }
        bandeja.piezas.add(pieza);
        pieza.setBandeja(bandeja);
    }

    @Override
    public Pieza get() {
        if (size() > 1) {
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
        return "Normal";
    }
}