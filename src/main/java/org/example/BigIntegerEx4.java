package org.example;

import java.math.BigInteger;

public class BigIntegerEx4 {
    public static void main(String[] args)  throws Exception {
        BigInteger bigInteger=new BigInteger("17");
        BigInteger bigInteger1=new BigInteger("171");
        System.out.println("Signum value for"+":"+bigInteger1.signum());
        BigInteger sub=bigInteger1.subtract(bigInteger);
        System.out.println(bigInteger1+"-"+bigInteger+":"+sub);
        BigInteger quotient=bigInteger1.divide(bigInteger);
        System.out.println(bigInteger1+"/"+bigInteger+"Quotient"+quotient);
        BigInteger remainder=bigInteger.remainder(bigInteger1);
        System.out.println("Remainder"+remainder);
        BigInteger shiftLeft=bigInteger.shiftLeft(4);
        System.out.println("ShiftLeft value"+shiftLeft);
        BigInteger shiftRight=bigInteger.shiftRight(4);
        System.out.println("Shift Right"+shiftRight);
    }
}
