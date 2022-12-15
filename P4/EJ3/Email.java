package Modelado.P4.EJ3;

import java.util.Date;

public class Email {
    private String from;
    private String subject;
    private Date date;
    private Priority priority;
    private String text;

    public String getFrom() {
        return from;
    }

    private void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    Date getDate() {
        return date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    Priority getPriority() {
        return priority;
    }

    private void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

}
