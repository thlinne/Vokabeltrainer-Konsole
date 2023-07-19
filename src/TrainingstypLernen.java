import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TrainingstypLernen extends TrainingstypBasis{

    protected void trainiereVokabel(Vokabel v) {
        Scanner sc = new Scanner(System.in);

        System.out.println(v.getVokabelDeutsch() + " - " + v.getVokabelEnglisch());

        System.out.println("Weiter mit Enter");
        sc.nextLine();
    }
}
