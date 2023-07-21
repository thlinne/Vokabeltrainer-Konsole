package training;

import linguistik.Vokabel;
import java.util.Scanner;

public class TrainingstypAbfragen extends TrainingstypBasis<Vokabel>{

    protected void trainiereAusdruck(Vokabel v){
        Scanner sc = new Scanner(System.in);

        System.out.println(v.getText());
        System.out.println("Gib die Übersetzung ein:");
        String uebersetzung = sc.next();

        if(uebersetzung.equals(v.getTranslation())){
            v.getStatistik().updateTraining(true);
            System.out.println("Das ist richtig");

        }else {
            v.getStatistik().updateTraining(false);
            System.out.println("Das ist falsch!");
            System.out.println("Möchten Sie die richtige Lösung sehen? (ja/nein)");
            String loesung_sehen = sc.next();
            if (loesung_sehen.equals("ja")) {
                System.out.println("Korrekte Loesung: " + v.getTranslation());
            }
        }
    }

}
