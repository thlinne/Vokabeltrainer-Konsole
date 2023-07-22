package linguistik;

import linguistik.Ausdruck;

public class Vokabel extends Ausdruck {

    public Vokabel(String text, Sprache s, Ausdruck translation){
        super(text,s);
        this.translation = translation;
    }

    public Ausdruck getTranslation(){
        return this.translation;
    }

    public String getText(){
        return super.getText() + " :-)";
    }

    private Ausdruck translation;
}
