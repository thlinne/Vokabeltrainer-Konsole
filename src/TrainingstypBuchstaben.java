import java.util.ArrayList;
import java.util.Scanner;

public class TrainingstypBuchstaben {

    public void trainiere(ArrayList<Vokabel> vokabeln){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= vokabeln.size() - 1; i++) {
            Vokabel v = vokabeln.get(i);

            String z = this.processString( v.getVokabelEnglisch());

            System.out.println(v.getVokabelDeutsch() + " - " + z);

            System.out.println("Weiter mit Enter");
            sc.nextLine();
        }
    }

    private String processString(String sin){
        char[] c =  sin.toCharArray();
        int  laenge = c.length;
        String filler = "***************************".substring(0, laenge - 2);
        String sout = c[0] + filler + c[c.length-1];
        return sout;
    }
}
