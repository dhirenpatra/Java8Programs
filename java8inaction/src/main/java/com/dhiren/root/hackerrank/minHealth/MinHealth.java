package com.dhiren.root.hackerrank.minHealth;

import java.util.Arrays;
import java.util.List;

public class MinHealth {

    private static long minHealth(List<Integer> intList) {
        int lastNegativePosition = 0;
        int sumOfPositive = 0 , sumOfNegative = 0;
        for(int i = intList.size() - 1 ; i >= 0 ; i--) {
            if(intList.get(i) < 0) {
                lastNegativePosition = i;
                break;
            }
        }
        for(int i = 0 ; i <= lastNegativePosition ; i++) {
            if(intList.get(i) < 0)
                sumOfNegative += intList.get(i);
            else
                sumOfPositive += intList.get(i);
        }
        return -sumOfNegative - sumOfPositive + 1;
    }

    public static void main(String[] args) {
        System.out.println(minHealth(Arrays.asList(-5,4,-2,3,1,-1,-6,-1,0,5)));
        System.out.println(minHealth(Arrays.asList(-5,4,-2,3,1,-1,-6,-1,0,-5)));
        System.out.println(minHealth(Arrays.asList(-1,4,-2,3,1,-1,-5,-5,0,5)));
    }

}
