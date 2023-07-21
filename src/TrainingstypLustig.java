import java.util.ArrayList;
import java.util.Comparator;

public class TrainingstypLustig extends TrainingstypBasis<Vokabel>{

    @Override
    protected void trainiereAusdruck(Vokabel v) {
        System.out.println("Lustig");
    }

    public void zusatz(){
        System.out.println("Viel Spaß!");
    }
}

