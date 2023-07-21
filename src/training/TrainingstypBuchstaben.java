package training;

import linguistik.Vokabel;
import java.util.Scanner;

public class TrainingstypBuchstaben extends TrainingstypBasis<Vokabel>{

    @Override
    protected void trainiereVokabel(Vokabel v) {
        Scanner sc = new Scanner(System.in);
        String z = this.processString( v.getTranslation());

        System.out.println(v.getText() + " - " + z);

        System.out.println("Weiter mit Enter");
        sc.nextLine();
    }

    private String processString(String sin){
        char[] c =  sin.toCharArray();
        int  laenge = c.length;
        String filler = "***************************".substring(0, laenge - 2);
        return c[0] + filler + c[c.length-1];
    }

}
