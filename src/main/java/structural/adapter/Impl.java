package structural.adapter;

public class Impl {

    public void adapt(){
        UIServiceAdapter adapter = new UIServiceAdapter();
        XmlData data = new XmlData();
        adapter.displayMenu(data);
        adapter.displayRecommendations(data);
    }
}
