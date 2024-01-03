package zad3;

public class Counter<T> {
    private int Count;
    public Counter(){
        this.Count=0;
    }

    public void add(T element){
        Count++;
    }

    public int getCount() {
        return Count;
    }
}

