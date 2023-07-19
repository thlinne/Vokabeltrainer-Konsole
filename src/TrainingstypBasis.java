import java.util.Comparator;

public abstract class TrainingstypBasis  implements Trainingstyp{

    protected Comparator<Vokabel> comparator;

    public  void setComparator(Comparator<Vokabel> c){
        this.comparator = c;
    }
}
