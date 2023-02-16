package structural.adapter;

public class Restaurant implements RestaurantApp {
    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Displaying menu");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying recommendations");
    }
}
