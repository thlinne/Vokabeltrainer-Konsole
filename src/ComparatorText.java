import java.util.Comparator;

public class ComparatorText implements Comparator<Ausdruck> {


    @Override
    public int compare(Ausdruck a1, Ausdruck a2) {

        if(a1.getText().compareTo(a2.text)>0){
            return 1;
        }
        if(a1.getText().compareTo(a2.text)<0){
            return -1;
        }
        return 0;
    }
}
