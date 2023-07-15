import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel("Katze", "cat");

        Vokabelliste vl = new Vokabelliste();
        vl.addVokabel(v1);
        vl.addVokabel(v2);

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Vokabel (n), neues Training (t), Statistik (s), Beenden (x)");

        String eingabe;

        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();

        while(!eingabe.equals("x")) {

            if (eingabe.equals("t")) {

                Vokabel[] vokabeln = vl.getVokabeln();

                for (int i = 0; i <= vokabeln.length - 1; i++) {
                    Vokabel v = vokabeln[i];
                    trainiereVokabel(v);
                }
            }

            if (eingabe.equals("n")) {

                System.out.println("Vokabel deutsch:");
                String vd = sc.next();

                System.out.println("Vokabel englisch:");
                String ve = sc.next();

                Vokabel v = new Vokabel(vd, ve);
                vl.addVokabel(v);
            }

            if(eingabe.equals("s")){
                Vokabel[] vokabeln = vl.getVokabeln();
                for (int i = 0; i <= vokabeln.length - 1; i++) {
                    Vokabel v = vokabeln[i];
                    System.out.println(v.getVokabelDeutsch() + " - " + v.getVokabelEnglisch() + " - " + v.getErfolgsquote() );
                }
            }

            System.out.println("Neue Vokabel (n), neues Training (t), Statistik (s), Beenden (x)");
            eingabe = sc.next();
        }
        System.out.println("Sie haben so viele Runden trainiert: " + v1.getErfolgsquote());
    }

    private static void trainiereVokabel(Vokabel v){
        Scanner sc = new Scanner(System.in);
        v.updateAnzahlTrainings();

        System.out.println(v.getVokabelDeutsch());
        System.out.println("Gib die Übersetzung ein:");
        String uebersetzung = sc.next();

        if(uebersetzung.equals(v.getVokabelEnglisch())){
            v.updateAnzahlErfolgreich();
            System.out.println("Das ist richtig");
        }else {
            System.out.println("Das ist falsch!");
            System.out.println("Möchten Sie die richtige Lösung sehen? (ja/nein)");
            String loesung_sehen = sc.next();
            if (loesung_sehen.equals("ja")) {
                System.out.println("Korrekte Loesung: " + v.getVokabelEnglisch());
            }
        }
    }
}
