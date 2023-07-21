package training;

import linguistik.Vokabel;

public class TrainingstypLustig extends TrainingstypBasis<Vokabel>{

    @Override
    protected void trainiereAusdruck(Vokabel v) {
        System.out.println("Lustig");
    }

    public void zusatz(){
        System.out.println("Viel Spaß!");
    }
}

