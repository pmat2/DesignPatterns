package structural.adapter;

public class UIServiceAdapter implements RestaurantApp {
    private final UIService uiService;

    public UIServiceAdapter() {
        uiService = new UIService();
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        uiService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        uiService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // conversion logic goes here
        return new JsonData();
    }
}
