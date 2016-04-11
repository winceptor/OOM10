public class EnumerationRestaurant {

    private String[] menu;

    public EnumerationRestaurant() {
        menu = new String[3];
        menu[0] = "Coffee";
        menu[1] = "Tea";
        menu[2] = "Milk";
    }

    public String[] getMenu() {
        return menu;
    }
}
