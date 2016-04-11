public class ArrayEnumerator implements Enumeration {

    private String[] enumarray;

    private int position;

    public ArrayEnumerator(String[] ea) {
        enumarray = ea;
        position = 0;
    }

    public Object nextElement() {
        return enumarray[position++];
    }

    public boolean hasMoreElements() {
        return position < enumarray.length;
    }
}