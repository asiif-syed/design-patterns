package Factory;

public class Client {
    public static void main(String[] args){
        Notification emailNotification = NotificationFactory.createNotification(NotificationType.EMAIL_NOTIFICATION);
        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS_NOTIFICATION);
        Notification appNotification = NotificationFactory.createNotification(NotificationType.APP_NOTIFICATION);

        emailNotification.notifyUser();
        smsNotification.notifyUser();
        appNotification.notifyUser();
    }
}
