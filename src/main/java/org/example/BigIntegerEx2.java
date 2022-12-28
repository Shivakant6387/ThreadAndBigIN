package org.example;

import java.io.IOException;
import java.math.BigInteger;

public class BigIntegerEx2 {
    static BigInteger factorial(int n){
        BigInteger f=new BigInteger("1");
        for (int i=2;i<=n;i++)
            f=f.multiply(BigInteger.valueOf(i));
        return f;
    }

    public static void main(String[] args) throws IOException {
        int n=20;
        System.out.println(factorial(n));
    }
}
