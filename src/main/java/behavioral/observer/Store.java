package behavioral.observer;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notifyCustomers(Event.NEW_ITEM);
    }

    public void newSalePromotion(){
        notificationService.notifyCustomers(Event.SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
