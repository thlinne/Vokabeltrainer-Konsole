public class Vokabel {

    private VokabelStatistik vokabelStatistik = new VokabelStatistik();

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

    private String vokabel_deutsch;
    private String vokabel_englisch;


    public  void updateTraining(boolean erfolg){
        vokabelStatistik.updateTraining(erfolg);
    }

    public double getErfolgsquote(){
        return vokabelStatistik.getErfolgsquote();
    }


}
