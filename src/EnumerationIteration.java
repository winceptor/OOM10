public class EnumerationIteration implements Iterator {

    private Enumeration enumeration;

    public EnumerationIteration(Enumeration e) {
        enumeration = e;
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
}
