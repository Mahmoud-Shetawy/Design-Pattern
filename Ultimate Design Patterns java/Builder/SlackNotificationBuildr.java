package Builder;

import java.util.List;

public class SlackNotificationBuildr implements NotificationBuilder {
    private String content;
    private String sender;
    private String recipient;
    private String timestamp;
    private List<String> attachments;
    private String theme;


    public SlackNotificationBuildr setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public SlackNotificationBuildr setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    @Override
    public SlackNotificationBuildr setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public SlackNotificationBuildr setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public SlackNotificationBuildr setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public SlackNotificationBuildr setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
        return timestamp;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public String getTheme() {
        return theme;
    }


    public SlackNotification build() {
        return new SlackNotification(this);

    }
}