public class Vokabelliste {

    private int size = 10;
    private Vokabel[] vokabeln = new Vokabel[size];
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
        size += 10;
        Vokabel[] vn = new Vokabel[size];

        for (int i=0; i<= vokabeln.length-1; i++){
            vn[i] = vokabeln[i];
        }
        this.vokabeln = vn;
    }
}
