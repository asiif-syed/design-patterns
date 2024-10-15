package Factory;

public class AppNotification implements Notification{
    private NotificationType type = NotificationType.APP_NOTIFICATION;

    @Override
    public NotificationType getType(){
        return this.type;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification to the user!");
    }
}
