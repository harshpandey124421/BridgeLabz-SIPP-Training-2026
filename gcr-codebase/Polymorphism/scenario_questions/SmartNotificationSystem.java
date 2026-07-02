class Notification {
    String recipientName;
    String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending generic notification to " + recipientName);
    }
}

class EmailNotification extends Notification {
    public EmailNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email Sent to [" + recipientName + "]: " + message);
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS Message Sent to [" + recipientName + "]: " + message);
    }
}

class PushNotification extends Notification {
    public PushNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Alert Sent to [" + recipientName + "]: " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Notification[] queue = {
            new EmailNotification("Alice", "Your statement is ready."),
            new SMSNotification("Bob", "Your OTP is 492011."),
            new PushNotification("Charlie", "Someone liked your post.")
        };
        for (Notification n : queue) {
            n.sendNotification();
        }
    }
}