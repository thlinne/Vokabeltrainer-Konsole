import java.util.Scanner;

public class TrainingstypLernen {

    public void trainiere(Vokabel[] vokabeln){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= vokabeln.length - 1; i++) {
            Vokabel v = vokabeln[i];
            System.out.println(v.getVokabelDeutsch() + " - " + v.getVokabelEnglisch());

            System.out.println("Weiter mit Enter");
            sc.nextLine();
        }
    }
}
