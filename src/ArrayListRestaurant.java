import java.util.ArrayList;

public class ArrayListRestaurant {

    private ArrayList menu;

    public ArrayListRestaurant() {
        menu = new ArrayList();
        menu.add("Vegetarian");
        menu.add("Pizza");
        menu.add("Beer");
    }

    public ArrayList getMenu() {
        return menu;
    }
}
