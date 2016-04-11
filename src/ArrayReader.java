public class ArrayReader implements Reader {

    public Iterator createIterator(Object menu) {
        return new ArrayIterator((String[]) menu);
    }
}
