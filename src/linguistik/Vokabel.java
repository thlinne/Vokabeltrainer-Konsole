package linguistik;

import linguistik.Ausdruck;

public class Vokabel extends Ausdruck {

    public Vokabel(String text, String translation){
        super(text);
        this.translation = translation;
    }

    public String getTranslation(){
        return this.translation;
    }

    public String getText(){
        return super.getText() + " :-)";
    }

    private String translation;
}
