public class Books{
    private String books;
    private double price;
    private int quantity;
    private int size;
    private String delivery;

    Books(int quantity, String books, double price, int size, String delivery){
        this.books = books;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
        this.delivery = delivery;
    }

    public String getBooks() {
        return books;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
    public String getDelivery() {
        return delivery;
    }

    
    
}
