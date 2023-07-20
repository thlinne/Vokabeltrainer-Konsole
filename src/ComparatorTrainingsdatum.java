import java.util.Comparator;

public class ComparatorTrainingsdatum implements Comparator<Vokabel> {

    @Override
    public int compare(Vokabel v1, Vokabel v2) {

        int comp = v1.getVokabelStatistik().getTraingsdatum().compareTo(v2.getVokabelStatistik().getTraingsdatum());

        return Integer.compare(comp, 0);

    }
}
