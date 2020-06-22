package model;


import java.util.Date;

public class book {
    String title;
    String ISBN;
    double price;
    int num;
    String author;
    String cbs;
    Date time;

    public book() {
    }

    public book(String title, String ISBN, double price, int num, String author, String cbs, Date time) {
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.num = num;
        this.author = author;
        this.cbs = cbs;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCbs() {
        return cbs;
    }

    public void setCbs(String cbs) {
        this.cbs = cbs;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", author='" + author + '\'' +
                ", cbs='" + cbs + '\'' +
                ", time=" + time +
                '}';
    }
}
