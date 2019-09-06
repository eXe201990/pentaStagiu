package Shop;

import java.util.Scanner;

 enum MemberShip {
    GOLD,SILVER,DEFAULT
}

public class Main {
    public static void main(String[] args) {

        int input = 0;

        Customer customer = new Customer(MemberShip.GOLD , 1 , "JOHN");
        Customer customer1 = new Customer(MemberShip.SILVER , 2 , "DAVE");
        Customer customer2 = new Customer(MemberShip.DEFAULT , 3 , "KENNY");


        Basket basket = new Basket(customer);

        Product products = new Books(1,"CASA DE PAPEL",11.2,);
        Product product2 = new Candy("Candy " , 2 ,20);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a product by entering a number(1 or 2): ");
        System.out.println("1 = Books author:" + products.getAuthor() + " .Books name " + products.getName() + " . Books price " + products.getPrice() + "$");
        System.out.println("2 = Candy name: " + product2.getName() + " Candy Price: " + product2.getPrice() + "$") ;

        while(true){
            try{
                input = scanner.nextInt();
            }catch (Exception e ){
                System.out.println("Iput invalid " +  e.getMessage());
            }

            switch (input){
                case 1 :
                    basket.addProduct(products);
                    break;
                case 2 :
                    basket.addProduct(product2);
                    break;
                default:
                    System.out.println("The input does not match with one of the products. Input = " + input);
            }


            basket.listBasketProducts();
            System.out.println("Total price " + basket.calculateTotal() + "$");
            System.out.println("Discounted price: " + basket.getDiscountedPrice()+ "$");
        }

    }
}
