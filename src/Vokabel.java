public class Vokabel {

    public Vokabel(String vokabel_deutsch, String vokabel_englisch){
        this.vokabel_deutsch = vokabel_deutsch;
        this.vokabel_englisch = vokabel_englisch;
    }

    public String getVokabelDeutsch(){
        return this.vokabel_deutsch;
    }

    public String getVokabelEnglisch(){
        return this.vokabel_englisch;
    }

    public  void updateAnzahlTrainings(){
        this.anzahl_trainings++;
    }

    public  void updateAnzahlErfolgreich(){
        this.anzahl_erfolgreich++;
    }

    public double getErfolgsquote(){
        if (this.anzahl_trainings > 0) {
            return (double) this.anzahl_erfolgreich / (double) this.anzahl_trainings;
        }else{
            return 0.0;
        }
    }

    private String vokabel_deutsch;
    private String vokabel_englisch;
    private int anzahl_trainings = 0;
    private int anzahl_erfolgreich = 0;
}
