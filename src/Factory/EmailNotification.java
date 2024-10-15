package Factory;

public class EmailNotification implements Notification{
   private NotificationType type = NotificationType.EMAIL_NOTIFICATION;

    @Override
    public NotificationType getType(){
        return this.type;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an E-mail to the user!");
    }


}
