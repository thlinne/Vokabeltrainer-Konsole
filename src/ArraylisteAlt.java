public class ArraylisteAlt<T> {

    private int size = 10;
    private T[] elemente = (T[]) new Object[size];
    private int index = 0;

    public void add(T v){
        if (index == elemente.length) {
            this.reseizeArray();
        }
        this.elemente[index] = v;
        this.index++;
    }

    public T[] get(){
        T[] kopie = (T[]) new Object[index];
        for ( int i=0; i<=index-1; i++){
            kopie[i] = elemente[i];
        }
        return kopie;
    }

    private void reseizeArray(){
        size += 10;
        T[] vn = (T[]) new Object[size];

        for (int i = 0; i<= elemente.length-1; i++){
            vn[i] = elemente[i];
        }
        this.elemente = vn;
    }
}
