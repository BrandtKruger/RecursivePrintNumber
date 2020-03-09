package com.Kruger.bdg;

public class Main {

    public static void main(String[] args) {

        printout(7623);

    }

    public static void printout(int n){

        if( n >= 10){
            printout(n / 10);
        }

        System.out.println(n%10);
    }
}
