package org.example;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("22");
        BigInteger b= BigInteger.valueOf(7877L);
        BigInteger c=BigInteger.TEN;
        BigInteger result=a.multiply(new BigInteger("55"))
                .add(new BigInteger("13"))
                .divide(BigInteger.valueOf(12));
        System.out.println(result);
    }
}
