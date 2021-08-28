package JavaCourse.javaEssential.Exceptions.task2;

import JavaCourse.javaEssential.Exceptions.task1.Worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException, Exception{
        ArrayList<Price> someShop = new ArrayList<Price>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of shop");
        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            String productName;
            String shop;
            String price;

            System.out.print("Product name = ");
            productName = br.readLine();
            System.out.print("Shop = ");
            shop = br.readLine();
            System.out.print("Price = ");
            price = br.readLine();

            someShop.add(new Price(productName,shop, price));
        }
        System.out.println("All Shops:");

        Collections.sort(someShop, new Comparator<Price>() {
            public int compare(Price v1, Price v2) {
                return v1.getShop().compareTo(v2.getShop());
            }
        });
        for (Price counterOfPrice:someShop) {
            System.out.println(counterOfPrice);
        }
        System.out.println("Would you like to find out information about the product from the following stores: ");
        for (Price shop:someShop) {
            System.out.println(shop.getShop());
        }
        String shopInformation = br.readLine();
        for (Price price : someShop) {
            if (price.getShop().equals(shopInformation)) {
                System.out.println("Product of " + shopInformation + ": ");
                System.out.println(price.getProductName());
            }else
                throw new Exception();
        }
    }
}
