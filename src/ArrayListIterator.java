import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

    private ArrayList list;

    private int position;

    public ArrayListIterator(ArrayList al) {
        list = al;
        position = 0;
    }

    public Object next() {
        return list.get(position++);
    }

    public boolean hasNext() {
        return position < list.size();
    }
}
