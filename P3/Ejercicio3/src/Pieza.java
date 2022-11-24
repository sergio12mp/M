public class Pieza {
    private Bandeja bandeja;

    public Bandeja getBandeja() {
        return bandeja;
    }

    void setBandeja(Bandeja bandeja) {
        assert bandeja != null;
        this.bandeja = bandeja;
    }
}