public class Mainclass {

    public static void main(String[] args) {
        ArrayRestaurant rest1 = new ArrayRestaurant();
        ArrayListRestaurant rest2 = new ArrayListRestaurant();
        
        Reader read1 = new ArrayReader();
        Reader read2 = new ArrayListReader();
        
        Iterator iter1 = read1.createIterator(rest1.getMenu());
        Iterator iter2 = read2.createIterator(rest2.getMenu());
        
        System.out.println("ArrayRestaurant has:");
        print(iter1);
        System.out.println("ArrayListRestaurant has:");
        print(iter2);
        
        //new code
        
        EnumerationRestaurant rest3 = new EnumerationRestaurant();
        Enumeration read3 = new ArrayEnumerator(rest3.getMenu());
        
        Iterator iter3 = new EnumerationIteration(read3);
        
        System.out.println("EnumerationRestaurant has:");
        print(iter3);
    }

    public static void print(Iterator iter) {
        while (iter.hasNext()) System.out.println(iter.next());
    }
}
