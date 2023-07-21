import linguistik.Ausdruck;
import linguistik.Sprache;
import linguistik.Vokabel;
import training.*;
import util.ComparatorText;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //linguistik.Ausdruck a1 = new linguistik.Ausdruck("Fisch");
        //linguistik.Ausdruck a2 = new linguistik.Vokabel("Fisch", "fish");

        Ausdruck a1 = new Ausdruck("ausruhen");
        a1.setSprache(Sprache.DE);

        Ausdruck s1 = new Ausdruck("erholen");
        Vokabel s2 = new Vokabel("entspannen", "relax");

        ArrayList<Ausdruck> synonyme = new ArrayList();
        synonyme.add(s1);
        synonyme.add(s2);
        a1.addSynonyme(synonyme);

        Vokabel s3 = new Vokabel("rumhängen", "hang out");
        Vokabel s4 = new Vokabel("abhängen", "hang out");
        ArrayList<Vokabel> synonyme2 = new ArrayList<>();
        synonyme.add(s3);
        synonyme.add(s4);

        a1.addSynonyme(synonyme2);


        /* ********************************************************************/
        //String a2_text = a2.getText();
        //System.out.println(a2_text);

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel("Katze", "cat");

        ArrayList<Vokabel> ar = new ArrayList();
        ar.add(v1);
        ar.add(v2);

        String NutzerAuswahl = "Neue linguistik.Vokabel (n), neues Training (t), training.Statistik (s), Beenden (x)";
        String NutzerAuswahlTrainingsmodus = "Trainingsmodus: Einprägen (1), Abfragen (2), Einprägen teils verdeckt (3), Lustig (4)";

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println(NutzerAuswahl);

        String eingabe;

        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();

        while(!eingabe.equals("x")) {

            if (eingabe.equals("t")) {

                System.out.println(NutzerAuswahlTrainingsmodus);
                int modus = Integer.parseInt(sc.next());

                //Comparator<linguistik.Vokabel> comparator = new util.ComparatorErfolgsquote();
                Comparator<Ausdruck> comparator = new ComparatorText();

                Trainingstyp<Vokabel> t = new TrainingstypAbfragen();
                if (modus == 1){
                    t = new TrainingstypLernen();
                }

                if(modus == 2){
                    t = new TrainingstypAbfragen();
                }

                if (modus == 3){
                    t = new TrainingstypBuchstaben();
                }

                if(modus==4){
                    t = new TrainingstypLustig();
                }

                t.setComparator(comparator);
                trainiere(ar, t);
            }

            if (eingabe.equals("n")) {

                System.out.println("linguistik.Vokabel deutsch:");
                String vd = sc.next();

                System.out.println("linguistik.Vokabel englisch:");
                String ve = sc.next();

                Vokabel v = new Vokabel(vd, ve);
                ar.add(v);
            }

            if(eingabe.equals("s")){
                for (int i = 0; i <= ar.size() - 1; i++) {
                    Vokabel v = ar.get(i);
                    System.out.println(v.getText() + " - " + v.getTranslation() + " - " + v.getStatistik().getErfolgsquote() );
                    System.out.println("Letztes Trainingsdatum: " + v.getStatistik().getTraingsdatum());
                    System.out.println("Letzte Erfolgsreihe: " + v.getStatistik().getErfolgsreihe());
                }
            }

            System.out.println("Neue linguistik.Vokabel (n), neues Training (t), training.Statistik (s), Beenden (x)");
            eingabe = sc.next();
        }
        System.out.println("Sie haben so viele Runden trainiert: " + v1.getStatistik().getErfolgsquote());
    }

    private static void trainiere(ArrayList<Vokabel> ar, Trainingstyp<Vokabel> t) {
        long start = System.currentTimeMillis();
        t.trainiere(ar);
        long ende = System.currentTimeMillis();
        long dauer = ende - start;
        System.out.println("Du hast " + dauer + " ms benötigt!");
    }
}
