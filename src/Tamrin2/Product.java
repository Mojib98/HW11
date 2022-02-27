package Tamrin2;

public class Product {
    private int id,price;
    private String name;
    private Category category;

    public Product(int id, int price, String name, Category category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    public int getPrice() {
        return price;
    }
}
