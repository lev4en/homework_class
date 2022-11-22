package com.example.dzhz;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        Card Card1 = new Card("902992910328923", 32863);
        Card Card2 = new Card("2000300040005000", 128379);
        Card Card3 = new Card("8295752197413628", 20);
        System.out.println(Card1.getInfo());
        System.out.println(Card2.getInfo());
        System.out.println(Card3.getInfo());
        System.out.println("Какую сумму Вы хотите положить на карту 1?");

        int add = in.nextInt();
        Card1.addBalance(add);

        System.out.println("Какую сумму Вы хотите положить на карту 2?");

        int add2 = in.nextInt();
        Card2.addBalance(add2);

        System.out.println("Какую сумму Вы хотите снять с карты 3?");

        int rem = in.nextInt();
        Card3.removeBalance(rem);

        System.out.println(Card1.getInfo());
        System.out.println(Card2.getInfo());
        System.out.println(Card3.getInfo());
    }
}
