import java.util.ArrayList;

public class ArrayListReader implements Reader {

    public Iterator createIterator(Object menu) {
        return new ArrayListIterator((ArrayList) menu);
    }
}
