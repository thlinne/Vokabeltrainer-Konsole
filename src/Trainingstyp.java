import java.util.ArrayList;
import java.util.Comparator;

public interface Trainingstyp {

    void setComparator(Comparator<? super Vokabel> c);

    void trainiere(ArrayList<Vokabel> vl);

}
