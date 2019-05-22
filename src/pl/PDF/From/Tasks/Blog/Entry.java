package pl.PDF.From.Tasks.Blog;

import java.sql.Time;

public abstract class Entry {
private int id;
private double date;
private User author;
private String content;

    public Entry(int id,double date, User author, String content) {
        this.id=id;
        this.date = date;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
