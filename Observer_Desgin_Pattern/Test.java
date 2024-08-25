public class Test {
    public static void main(String args[]) {
        EmailListener emailListener = new EmailListener("abc@gmail.com");
        NotificationService notificationService = new NotificationService();

        notificationService.subscriber(emailListener);
    }
}
