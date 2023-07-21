import java.util.Scanner;

public class TrainingstypBuchstaben extends TrainingstypBasis{

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
        String sout = c[0] + filler + c[c.length-1];
        return sout;
    }
}
