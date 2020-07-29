package com.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        int[] arr={1,3,53,4,2};
        List<Integer> list= new ArrayList<Integer>(5);
        Arrays.sort(arr);
        System.out.println(arr);
        String time="7:01:01PM";
        if(time.endsWith("AM")){
            System.out.println(time.substring(0,time.indexOf("AM")));
        }else {
            String temp=time.substring(0,time.indexOf("PM"));
            String[] tempArr=temp.split(":");
            String result=(Integer.parseInt(tempArr[0])+12)+":"+tempArr[1]+":"+tempArr[2];
            System.out.println(result);
        }

        countApplesAndOranges(37455 ,87275,);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int resultS=0;
        int resultT=0;
        for(int i=0,length=apples.length;i<length;i++){
            long temp=(long)a+apples[i];
            if(temp>=s&&temp<=t){
                resultS++;
            }
        }
        for(int i=0,length=oranges.length;i<length;i++){
            long temp=(long)b+oranges[i];
            if(temp>=s&&temp<=t){
                resultT++;
            }
        }
        System.out.println(resultS);
        System.out.println(resultT);

    }
}
