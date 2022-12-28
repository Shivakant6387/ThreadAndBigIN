package org.example;

import java.math.BigInteger;

public class BigIntegerEx3
{
    public static void main(String[] args)  throws  Exception{
        BigInteger  bigInteger=new BigInteger("1");
        int n=4;
        for(int i=2;i<=n;i++){
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of n"+bigInteger);
        BigInteger bigInteger1=new BigInteger("197");
        System.out.println("isProbable prime method will return :"+bigInteger1.isProbablePrime(2));
        BigInteger nextPrimeNumber=bigInteger1.nextProbablePrime();
        BigInteger min=bigInteger.min(bigInteger1);
        System.out.println("Min value "+min);
        BigInteger max= bigInteger.max(bigInteger1);
        System.out.println("max value "+max);
    }
}
