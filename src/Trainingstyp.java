import java.util.ArrayList;
import java.util.Comparator;

public interface Trainingstyp<T extends Ausdruck> {

    void setComparator(Comparator<? super T> c);

    void trainiere(ArrayList<T> vl);

}
