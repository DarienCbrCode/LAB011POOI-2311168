package ProyectoListaLibros;

public class Book {
    private static int bookNumberCounter = 0;
    private int bookNumber;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.bookNumber = ++bookNumberCounter;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    
    @Override
public String toString() {
    return String.format("%s by %s (%c) at %s, Price: $%.2f, Qty: %d",
            name, author.toString(), author.getGender(), author.getEmail(), price, qty);
}
}