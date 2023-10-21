package org.courses.ex7_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Price> productList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter product name");
            String name = sc.next();
            System.out.println("Enter product shop");
            String shop = sc.next();
            System.out.println("Enter product price");
            Double price = sc.nextDouble();

            Price product = new Price(name, shop, price);
            productList.add(product);
        }

        Collections.sort(productList, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getShop().compareTo(o2.getShop());
            }
        });

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shop name");
        String shopName = scanner.next();

        for (Price p : productList) {
                if (shopName.equals(p.getShop())) {
                    System.out.println(p.getName());
                    System.out.println(p.getPrice());
                } else {
                throw new RuntimeException("There is no such shop.");
            }
        }
    }
}

