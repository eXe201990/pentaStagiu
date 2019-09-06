package Shop;

public class Books extends Product{

    private String author;


    public Books(int id, String name, float price, String author) {
        super(id,name,price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

}
