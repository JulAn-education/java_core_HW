package lesson4_HW.task2;

public class Shop {

    private Order[] arrOrder = new Order[5];

    private Shopper[] people;

    private Product[] products;
    public Shop() {

        products = new Product[] {
                new Product("Ball", 100),
                new Product("Sandwich", 1000),
                new Product("Table", 10000),
                new Product("Car", 100000),
                new Product("Rocket", 10000000)
        };

        people = new Shopper[]{
                new Shopper("Ivan", 20),
                new Shopper("Petr", 30)};
    }



    private boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) return true;
        }
        return false;
        }

    public Order buy(Shopper shopper, Product product, int price) throws CustomerException, ProductException, AmountException {
        if (!isInArray(people, shopper))
            throw new CustomerException("Unknown shopper: " + shopper);
        if (!isInArray(products, product))
            throw new ProductException("Unknown product: " + product);
        if (price < 0 || price > 100) {
            throw new AmountException("Incorrect price: " + price);
        }
        return new Order(shopper, product, price);
    }

    public void start() throws CustomerException, AmountException, ProductException {
        Object[][] info = {
                {people[0], products[0], 1}, //good
                {people[1], products[1], -1}, //bad amount -1
                {people[0], products[2], 150}, //bad amount >100
                {people[1], new Product("Mango", 15), 1},
                {new Shopper("Tim", 30), products[3], 1},
        };
        int capacity = 0;
        int i = 0;
        while (capacity != arrOrder.length - 1 || i != info.length) {
            try {
                arrOrder[capacity] = buy((Shopper) info[i][0], (Product) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                arrOrder[capacity++] = buy((Shopper) info[i][0], (Product) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders: " + capacity);
            }
            ++i;
        }
    }
}

