package Factory;

public class Client {
    public static void main(String[] args){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification emailNotification = notificationFactory.createNotification(NotificationType.EMAIL_NOTIFICATION);
        Notification smsNotification = notificationFactory.createNotification(NotificationType.SMS_NOTIFICATION);
        Notification appNotification = notificationFactory.createNotification(NotificationType.APP_NOTIFICATION);

        emailNotification.notifyUser();
        smsNotification.notifyUser();
        appNotification.notifyUser();
    }
}
