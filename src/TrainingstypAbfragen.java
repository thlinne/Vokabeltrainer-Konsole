import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TrainingstypAbfragen extends TrainingstypBasis{

    protected void trainiereVokabel(Vokabel v){
        Scanner sc = new Scanner(System.in);

        System.out.println(v.getVokabelDeutsch());
        System.out.println("Gib die Übersetzung ein:");
        String uebersetzung = sc.next();

        if(uebersetzung.equals(v.getVokabelEnglisch())){
            v.getVokabelStatistik().updateTraining(true);
            System.out.println("Das ist richtig");

        }else {
            v.getVokabelStatistik().updateTraining(false);
            System.out.println("Das ist falsch!");
            System.out.println("Möchten Sie die richtige Lösung sehen? (ja/nein)");
            String loesung_sehen = sc.next();
            if (loesung_sehen.equals("ja")) {
                System.out.println("Korrekte Loesung: " + v.getVokabelEnglisch());
            }
        }
    }

}
