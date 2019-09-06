package Shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int total = 0;
    Customer customemer;
    List<Product> products = new ArrayList<>();

    public Basket(Customer customer){
        this.customemer = customer;
    }

    public int getTotal(){
        return total;
    }


    public int getDiscountedPrice(){
        int discount = 0;
        switch(customemer.getMembership()){
            case GOLD:
                discount = total * 20 / 100;
                total -= discount;
                break;
            case SILVER:
                discount = total * 10 / 200;
                total -= discount;
                break;
            default:
                return total;
        }
            return total;
    }


    public void addProduct(Product product){
        this.products.add(product);
    }

    public void listBasketProducts() {
        for (Product product : products) {
            System.out.println(product.getId() + " .NAMe " + product.getName() + " .Price " + product.getPrice() + "$");
        }
    }

        public int calculateTotal(){
            for(Product product : products){
                total += product.getPrice();
            }
            return total;
        }
    }

