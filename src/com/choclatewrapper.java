package com;
public class choclatewrapper {
    public static void main(String[] args) {
        int money = 15;
        int pricePerChocolate = 1;
        int wrappersNeeded = 3;

        int chocolates = money / pricePerChocolate;
        int wrappers = chocolates;

        while (wrappers >= wrappersNeeded) {
            int newChocolates = wrappers / wrappersNeeded;

            chocolates += newChocolates;
            wrappers = (wrappers % wrappersNeeded) + newChocolates;
        }

        System.out.println("Total chocolates = " + chocolates);
    }
}