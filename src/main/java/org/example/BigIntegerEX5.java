package org.example;

import java.math.BigInteger;

public class BigIntegerEX5 {
    static BigInteger fact(int num){
        BigInteger bigInteger=new BigInteger("1");
        for (int i =1;i<=num;i++){
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;

    }

    public static void main(String[] args) {
        int num=1000;
        System.out.println(fact(num));
    }
}
