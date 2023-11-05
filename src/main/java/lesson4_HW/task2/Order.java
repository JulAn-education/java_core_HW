package lesson4_HW.task2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Product product;
    private Shopper shopper;

    private List<Product> productList;

    private List<Shopper> shopperList;

    public Order(Shopper who, Product what, int price) {
        this.productList = new ArrayList<>();
    }

    public Order(List<Shopper> shopperList) {
        this.shopperList = shopperList;
    }


}
