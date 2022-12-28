package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //int x,y,temp;
        BigInteger x,y,temp;
        System.out.println("Enter x and y");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextBigInteger();
        y=scanner.nextBigInteger();
        System.out.println("Before swapping "+x+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping "+x+y);
    }
}
