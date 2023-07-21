public class Ausdruck {
    protected String text;
    private Statistik statistik = new Statistik();

    public Ausdruck(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public Statistik getStatistik() {

        return this.statistik;
    }
}
