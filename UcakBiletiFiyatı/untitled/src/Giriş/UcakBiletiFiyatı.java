package Giriş;

import java.util.Scanner;

public class UcakBiletiFiyatı {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double price;
        int years, type, km;
        boolean isError = false;

        System.out.println("Uçuş Tipi Seçin\n1-) Tek Yön \n2-) Gidiş-Dönüş ");
        type = input.nextInt();

        System.out.println("Mesafe (km): ");
        km = input.nextInt();

        System.out.println("Yaşınız: ");
        years = input.nextInt();

        if (((km > 0) && (years > 0)) && ((type >= 1) && (type <= 2))) {
            isError = false;
            price = km * 0.1;
            if (type == 2) {
                price = price * 0.8;
            } else {
                price = price * 1;
                if (years < 12) {
                    price = price * 0.5;
                    System.out.println(price);

                } else if ((years >= 12) && (years <= 24)) {
                    price = price * 0.9;
                    System.out.println(price);
                } else if (years > 65) {
                    price = price * 0.7;
                    System.out.println(price);
                } else {
                    System.out.println(price);
                }


            }
        } else {
            if (isError = true) {
                System.out.println("hatalı girirş");
            } else {
                System.out.println("");

            }
        }
    }
}

