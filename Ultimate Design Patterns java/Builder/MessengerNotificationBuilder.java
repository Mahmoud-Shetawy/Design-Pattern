package Builder;

import java.util.List;

public class MessengerNotificationBuilder implements NotificationBuilder {
    private String content;
    private String sender;
    private String recipient;
    private String Timestamp;
    private List<String> attachments;
    private String theme;



    public MessengerNotificationBuilder setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public MessengerNotificationBuilder setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public MessengerNotificationBuilder setTimestamp(String timestamp) {
        this.Timestamp = timestamp;
        return this;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public String getTheme() {
        return theme;
    }

    public MessengerNotification build() {
        return new MessengerNotification(this);

    }
}
