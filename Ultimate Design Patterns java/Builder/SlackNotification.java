package Builder;

import java.util.List;

public class SlackNotification {

        private String content;
        private String sender;
        private String recipient;
        private String timestamp;
        private List<String> attachments;
        private String theme;

         SlackNotification(SlackNotificationBuildr slackNotificationBuilder){
            this.content = slackNotificationBuilder.getContent();
            this.sender = slackNotificationBuilder.getSender();
            this.recipient = slackNotificationBuilder.getRecipient();
            this.timestamp = slackNotificationBuilder.getTimestamp();
            this.attachments = slackNotificationBuilder.getAttachments();
            this.theme = slackNotificationBuilder.getTheme();


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
    }


