package Factory;

public class NotificationFactory {

    public Notification createNotification(NotificationType notificationType){
        switch (notificationType){
            case EMAIL_NOTIFICATION:
                return new EmailNotification();
            case SMS_NOTIFICATION:
                return new SmsNotification();
            case APP_NOTIFICATION:
                return new AppNotification();
            default:
                return null;
        }
    }
}
