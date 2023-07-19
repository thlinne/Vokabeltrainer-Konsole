import java.util.ArrayList;
import java.util.Comparator;

public class TrainingstypLustig extends TrainingstypBasis{

    @Override
    public void trainiere(ArrayList<Vokabel> vl) {
        if(this.comparator != null) {
            vl.sort(this.comparator);
        }

        System.out.println("Bitte heute nicht lernen!");
    }
}

