import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel("Katze", "cat");

        ArrayList<Vokabel> vl = new ArrayList();
        vl.add(v1);
        vl.add(v2);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Vokabel (n), neues Training (t), Statistik (s), Beenden (x)");

        String eingabe;

        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();

        while(!eingabe.equals("x")) {

            if (eingabe.equals("t")) {

                System.out.println("Trainingsmodus: Einprägen (1), Abfragen (2), Einprägen teils verdeckt (3)");
                int modus = Integer.parseInt(sc.next());

                //Vokabel[] vokabeln = vl.get();

                if (modus == 1){
                    TrainingstypLernen t = new TrainingstypLernen();
                    t.trainiere(vl);
                }

                if(modus == 2){
                    TrainingstypAbfragen t = new TrainingstypAbfragen();
                    t.trainiere(vl);
                }

                if (modus == 3){
                    TrainingstypBuchstaben t = new TrainingstypBuchstaben();
                    t.trainiere(vl);
                }

            }

            if (eingabe.equals("n")) {

                System.out.println("Vokabel deutsch:");
                String vd = sc.next();

                System.out.println("Vokabel englisch:");
                String ve = sc.next();

                Vokabel v = new Vokabel(vd, ve);
                vl.add(v);
            }

            if(eingabe.equals("s")){
                for (int i = 0; i <= vl.size() - 1; i++) {
                    Vokabel v = vl.get(i);
                    System.out.println(v.getVokabelDeutsch() + " - " + v.getVokabelEnglisch() + " - " + v.getVokabelStatistik().getErfolgsquote() );
                    System.out.println("Letztes Trainingsdatum: " + v.getVokabelStatistik().getTraingsdatum());
                    System.out.println("Letzte Erfolgsreihe: " + v.getVokabelStatistik().getErfolgsreihe());
                }
            }

            System.out.println("Neue Vokabel (n), neues Training (t), Statistik (s), Beenden (x)");
            eingabe = sc.next();
        }
        System.out.println("Sie haben so viele Runden trainiert: " + v1.getVokabelStatistik().getErfolgsquote());
    }

}
