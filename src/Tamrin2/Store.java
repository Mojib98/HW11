package Tamrin2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Store {
    Category cheapPhone = new Category("CheapPhone",1);
    Category expensivePhone = new Category("ExpensivePhone",2);
    //********************************************************
    Product phone = new Product(1,200,"nokia",cheapPhone);
    Product phone2 = new Product(2,3000,"iphone",expensivePhone);
    Product phone3 = new Product(3,2500,"samsung",expensivePhone);
    Product phone4 = new Product(4,300,"xiaomi",cheapPhone);
    Product phone5 = new Product(5,100,"oppo",cheapPhone);
    List<Product> productList = new ArrayList<>(Arrays.asList(phone,phone2,phone3,phone4,phone5));
    //*******************************************************
    Customer majid = new Customer("Majid",1);
    List<Product> majidProduct = new ArrayList<>(Arrays.asList(phone,phone2));
    Order orderMajid = new Order(3,majidProduct,new Date(2022,12,2),majid);
    //*************************************************************
    Customer ahmad = new Customer("ahmad",2);
    List<Product> ahmadProduct = new ArrayList<>(Arrays.asList(phone3,phone4));
    Order ahmaeOrder = new Order(4,ahmadProduct,new Date(2022,10,2),ahmad);
    //*******************************************************
    Customer mohsen = new Customer("mohsen",4);
    List<Product> mohsenProduct = new ArrayList<>(Arrays.asList(phone5));
    Order mohsenOreder = new Order(5,mohsenProduct,new Date(2022,8,1),mohsen);
    //*******************************************************
    List<Order> orderList = new ArrayList<>(Arrays.asList(ahmaeOrder,mohsenOreder,orderMajid));
    //********************************
    Date date1 = new Date();
    public void showProdut(){
        System.out.println(productList.stream().filter((a)->a.getCategory()
                .name.equals("CheapPhone")).collect(Collectors.toList()));
    }
    public void showCheaper(){
        System.out.println(productList.stream().min(Comparator.comparing(Product::getPrice)));
    }
    public void showBetween(){
        System.out.println(orderList.stream().filter(
                (a)->a.getDate().after(new Date(2022,8,1)) && a.getDate().before(new Date(2022,12,2))).collect(Collectors.toList())
        );
    }
    public void average(){
        System.out.println(orderList.stream().filter(
                (a)->a.getDate().after(new Date(2022,8,1))).collect(Collectors.averagingInt((a)->a.getTotalPrice()))
        );

    }










}



