package com.example.dzhz;

public class Card {
    public String serialNumber;
    public int balance;

    public Card(String serialNumber, int balance) {
        this.serialNumber = serialNumber;
        this.balance = balance;
    }

    public void addBalance(int addingSum) {
        this.balance += addingSum;
        System.out.println("Зачислено:" + addingSum + ". Текущий остаток: " + this.balance);
    }

    public void removeBalance(int removingSum) {
        if(removingSum<=this.balance){
            this.balance -= removingSum;
            System.out.println("Снято:" + removingSum + ". Текущий остаток: " + this.balance);
        }
        else {
            System.out.println("Недостаточно средств");
        }

    }

    public String getInfo() {
        return "Номер карты: " + this.serialNumber + ". Баланс: " + this.balance;
    }
}