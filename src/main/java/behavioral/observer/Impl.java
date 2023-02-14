package behavioral.observer;

public class Impl {

    public void subscirbeAndNotify() {

        Store store = new Store();
        store.getNotificationService().subscribe(Event.NEW_ITEM, new EmailMessageListener("pawel@devpro.dev"));
        store.getNotificationService().subscribe(Event.SALE, new EmailMessageListener("pawel@devpro.dev"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new MobileMessageListener("pmat29"));
        store.getNotificationService().subscribe(Event.SALE, new MobileMessageListener("daro"));

        store.newItemPromotion();

        store.newSalePromotion();

        store.getNotificationService().unsubscribe(Event.NEW_ITEM, new EmailMessageListener("pawel@devpro.dev"));

        store.newItemPromotion();
    }
}
