package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GongBeiShu {

    public static void main(String[] args) {

        long gys = gys(3L, 5L);
        System.out.println(gys);
        long gbs = gbs(3, 5L);
        System.out.println(gbs);
        List<Integer> list = Arrays.asList(51);
        System.out.println(gys(list));
        System.out.println(gbs(list));
        list.get

    }

    public static long gys(List<Integer> list) {
        long gys = 1;
        for (int i = 0, length = list.size(); i < length; i++) {
            if (i == 0) {
                gys = gys(list.get(i), list.get(i + 1));
            } else {
                gys = gys(gys, list.get(i));
            }

        }
        return gys;
    }

    public static long gbs(List<Integer> list) {
        long gbs = 1;
        for (Integer integer : list) {
            gbs = gbs(integer, gbs);
        }
        return gbs;
    }

    public static long gbs(long a, long b) {
        return a * b / gys(a, b);
    }

    public static long gys(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        if (max % min != 0) {
            return gys(min, max % min);
        } else {
            return min;
        }
    }
}
