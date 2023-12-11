package org.generation.lesson.shop;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        HashSet<Product> carrello = new HashSet<>();

        while (!stop) {
            System.out.println("vuoi inserire un prodotto nel carrello?y/n");
            String answer = scanner.nextLine();


            if (answer.equals("y")) {
                System.out.println("che tipo di prodotto vuoi acquistare ? smartphone, televisore o cuffie?");
                String typeOfProd = scanner.nextLine();
                if (typeOfProd.equals("smartphone")) {

                    System.out.println("come si chiama il prodotto?");
                    String userName = scanner.nextLine();
                    System.out.println("aggiungi una descrizione del prodotto");
                    String userDesc = scanner.nextLine();
                    System.out.println("quanto costa?");
                    BigDecimal userPrice = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("quanto vale l'iva?");
                    BigDecimal userIva = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("a che categoria appartiene ?");
                    String userCat = scanner.nextLine();
                    System.out.println("aggiungi una descrizione della categoria");
                    String userCatDesc = scanner.nextLine();
                    Category category = new Category(userCat, userCatDesc);
                    System.out.println("inserisci in codice imei");
                    int smartImei = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci la quantità di memoria (n memoria)");
                    String smartMemory = scanner.nextLine();
                    Smartphone smartphone = new Smartphone(userName, userDesc, userPrice, userIva, category, smartImei, smartMemory);


                    boolean added = carrello.add(smartphone);
                    if (!added) {
                        System.out.println("smartphone already added");
                    }
                } else if (typeOfProd.equals("televisore")) {
                    System.out.println("come si chiama il prodotto?");
                    String userName = scanner.nextLine();
                    System.out.println("aggiungi una descrizione del prodotto");
                    String userDesc = scanner.nextLine();
                    System.out.println("quanto costa?");
                    BigDecimal userPrice = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("quanto vale l'iva?");
                    BigDecimal userIva = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("a che categoria appartiene ?");
                    String userCat = scanner.nextLine();
                    System.out.println("aggiungi una descrizione della categoria");
                    String userCatDesc = scanner.nextLine();
                    Category category = new Category(userCat, userCatDesc);
                    System.out.println("inserisci le dimesioni");
                    int smartDim = Integer.parseInt(scanner.nextLine());
                    System.out.println("è smar? y/n");
                    String smartTvOrNot = scanner.nextLine();
                    boolean smarttv = false;
                    if (smartTvOrNot.equals("y")) {
                        smarttv = true;
                    }


                    Televisore tv = new Televisore(userName, userDesc, userPrice, userIva, category, smartDim, smarttv);
                    boolean added = carrello.add(tv);
                    if (!added) {
                        System.out.println("tv already added");
                    }
                } else if (typeOfProd.equals("cuffie")) {
                    System.out.println("come si chiama il prodotto?");
                    String userName = scanner.nextLine();
                    System.out.println("aggiungi una descrizione del prodotto");
                    String userDesc = scanner.nextLine();
                    System.out.println("quanto costa?");
                    BigDecimal userPrice = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("quanto vale l'iva?");
                    BigDecimal userIva = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
                    System.out.println("a che categoria appartiene ?");
                    String userCat = scanner.nextLine();
                    System.out.println("aggiungi una descrizione della categoria");
                    String userCatDesc = scanner.nextLine();
                    Category category = new Category(userCat, userCatDesc);
                    System.out.println("inserisci il colore");
                    String color = scanner.nextLine();
                    System.out.println("sono wireless?? y/n");
                    String smartCuffie = scanner.nextLine();
                    boolean smartHead = false;
                    if (smartCuffie.equals("y")) {
                        smartHead = true;
                    }


                    Cuffie cuffie = new Cuffie(userName, userDesc, userPrice, userIva, category, color, smartHead);
                    boolean added = carrello.add(cuffie);
                    if (!added) {
                        System.out.println("cuffie already added");
                    }
                }


            } else {
                System.out.println("perfetto hai finito di acquistare");
                stop = true;
                for (Product element:carrello){
                    System.out.println(element);
                }



            }




        }scanner.close();
    }
}
