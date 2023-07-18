import java.util.ArrayList;
import java.util.Scanner;

public class TrainingstypLernen implements Trainingstyp{

    public void trainiere(ArrayList<Vokabel> vokabeln){

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i <= vokabeln.size() - 1; i++) {
                Vokabel v = vokabeln.get(i);
                System.out.println(v.getVokabelDeutsch() + " - " + v.getVokabelEnglisch());

                System.out.println("Weiter mit Enter");
                sc.nextLine();
            }
        }
    }
}
