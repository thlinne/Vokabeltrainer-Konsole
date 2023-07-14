public class Vokabelliste {

    private Vokabel[] vokabeln = new Vokabel[10];
    private int index = 0;

    public void addVokabel(Vokabel v){

        if (index == vokabeln.length) {
            this.reseizeArray();
        }
        this.vokabeln[index] = v;
        this.index++;
    }

    public Vokabel[] getVokabeln(){

        Vokabel[] kopie = new Vokabel[index];

        for ( int i=0; i<=index-1; i++){
            kopie[i] = vokabeln[i];
        }
        return kopie;
    }

    private void reseizeArray(){
        Vokabel[] vn = new Vokabel[vokabeln.length+10];

        for (int i=0; i<= vokabeln.length-1; i++){
            vn[i] = vokabeln[i];
        }
        this.vokabeln = vn;
    }
}
