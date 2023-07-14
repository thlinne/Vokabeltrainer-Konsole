import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel("Katze", "cat");

        Vokabel[] vokabeln = new Vokabel[10];
        vokabeln[0] = v1;
        vokabeln[1] = v2;

        int index = 2;

        System.out.println("Willkommen zum Vokabeltrainer!");
        System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");

        String eingabe;

        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();

        while(!eingabe.equals("x")) {

            if (eingabe.equals("t")) {
                for (int i = 0; i <= index - 1; i++) {
                    Vokabel v = vokabeln[i];
                    trainiereVokabel(v);
                }
            }

            if (eingabe.equals("n")) {

                if (index < vokabeln.length) {

                    System.out.println("Vokabel deutsch:");
                    String vd = sc.next();

                    System.out.println("Vokabel englisch:");
                    String ve = sc.next();

                    Vokabel v = new Vokabel(vd, ve);
                    vokabeln[index] = v;
                    index++;
                }
            }
            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
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
