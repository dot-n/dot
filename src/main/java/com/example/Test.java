package com.example;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {
        long[] ar = {1111L, 2222L};
        BigInteger bi = BigInteger.ZERO;
        for (long l : ar) {
            bi = bi.add(BigInteger.valueOf(l));
        }
        System.out.println(bi.longValue());
        System.out.println(BigDecimal.valueOf(11d / 3).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue());

        int n = 6;

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0, size = n - i-1; j < size; j++) {
                temp += " ";
            }
            for (int m = 0; m <= i; m++) {
                temp += "#";
            }
            System.out.println(temp);
        }
    }
}
