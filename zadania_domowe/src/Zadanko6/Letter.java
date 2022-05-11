package Zadanko6;

public class Letter {
    private Person sender;
    private Person recipient;
    private String content;

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Letter(Person sender, Person recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public String getSenderData() {
        return "Sender: " + sender.getData();
    }

    public String getRecipientData() {
        return "Recipient: " + recipient.getData();
    }

    public String getContentData() {
        return "Content: " + content;
    }
}
