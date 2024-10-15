package Factory;

public class SmsNotification implements  Notification{
    private NotificationType type = NotificationType.SMS_NOTIFICATION;

    @Override
    public NotificationType getType(){
        return this.type;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS to the user!");
    }
}
