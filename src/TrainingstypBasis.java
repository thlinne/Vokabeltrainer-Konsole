import java.util.ArrayList;
import java.util.Comparator;

public abstract class TrainingstypBasis  implements Trainingstyp{

    public TrainingstypBasis(Comparator comparator){

    }

    protected Comparator<Vokabel> comparator;

    public  void setComparator(Comparator<Vokabel> c){
        this.comparator = c;
    }

    public void trainiere(ArrayList<Vokabel> vokabeln){

        if(this.comparator != null) {
            vokabeln.sort(this.comparator);
        }

        for (int i = 0; i <= vokabeln.size() - 1; i++) {
            Vokabel v = vokabeln.get(i);
            trainiereVokabel(v);
        }
    }

    protected abstract void trainiereVokabel(Vokabel vokabel);
}
