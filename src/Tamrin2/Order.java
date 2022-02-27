package Tamrin2;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    List<Product> list;
    private int totalPrice;
    private Date date;
    private  Customer customer;

    public int getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
    private int totalPrice(){
        for (Product p :list
             ) {
            totalPrice =+p.getPrice();
        }
        return totalPrice;
    }

    public Order(int id, List<Product> list, Date date,Customer customer) {
        this.id = id;
        this.list = list;
        this.date = date;
        this.totalPrice = totalPrice();
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", list=" + list +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }
}
