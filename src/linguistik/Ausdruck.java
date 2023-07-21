package linguistik;

import training.Statistik;
import java.util.ArrayList;

public class Ausdruck {
    protected String text;
    private Sprache sprache;
    private Statistik statistik = new Statistik();
    private ArrayList<Ausdruck> synonyme = new ArrayList();

    public void addSynonyme(ArrayList<? extends Ausdruck> s){

        synonyme.addAll(s);
    }

    public Ausdruck(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public Statistik getStatistik() {

        return this.statistik;
    }

    public void setSprache(Sprache s) {
        this.sprache = sprache;
    }
}
