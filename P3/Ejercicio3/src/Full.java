public class Full extends Estado {
    public Full(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
        assert p != null;
        assert size() < bandeja.getCapacidad();
        bandeja.piezas.add(p);
        p.setBandeja(bandeja);
    }

    @Override
    public Pieza get() {
        if (bandeja.getCapacidad() > 1) {
            bandeja.setEstado(new Normal(bandeja));
        } else {
            bandeja.setEstado(new Empty(bandeja));
        }

        Pieza p = bandeja.piezas.poll();
        p.setBandeja(null);
        return p;
    }

    @Override
    public String toString() {
        return "Full";
    }
}