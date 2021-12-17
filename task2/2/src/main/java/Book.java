public class Book {
    private int cost;
    private String name;
    private String author;

    public Book() {
        this(0, "NONE", "NONE");
    }

    public Book(int cost) {
        this(cost, "NONE", "NONE");
    }

    public Book(String name, String author) {
        this(0, name, author);
    }

    public Book(int cost, String name, String author) {
        this.cost = cost;
        this.name = name;
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + this.name + " Author: " + this.author + " Cost: " + this.cost;
    }
}
