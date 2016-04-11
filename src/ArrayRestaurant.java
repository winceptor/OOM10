public class ArrayRestaurant {

    private String[] menu;

    public ArrayRestaurant() {
        menu = new String[3];
        menu[0] = "Homemade";
        menu[1] = "Soup";
        menu[2] = "Dessert";
    }

    public String[] getMenu() {
        return menu;
    }
}
