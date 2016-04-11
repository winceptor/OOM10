public class ArrayIterator implements Iterator {

    private String[] array;

    private int position;

    public ArrayIterator(String[] a) {
        array = a;
        position = 0;
    }

    public Object next() {
        return array[position++];
    }

    public boolean hasNext() {
        return position < array.length;
    }
}
