package com.interswitch.maven;

import java.util.List;

public class Calculator {
    public static Double add(List<Double> nums){
        Double sum = 0.0;
        for (Double num: nums){
            sum += num;
        }
        return  sum;
    }

    public static Double multiply(List<Double> nums){
        Double cummulative = 0.0;
        for (Double num: nums){
            cummulative *= num;
        }
        return  cummulative;
    }

    public static Double add(Double[] nums){
        Double sum = 0.0;
        for (Double num: nums){
            sum += num;
        }
        return  sum;
    }

    public static Double multiply(Double[] nums){
        Double cummulative = 0.0;
        for (Double num: nums){
            cummulative *= num;
        }
        return  cummulative;
    }

    public static Double subtract(Double num1, Double num2){
        return  num1 - num2;
    }

    public static Double divide(Double num1, Double num2){
        return  num1 / num2;
    }

    public static Double add(Double num1, Double num2){
        return  num1 + num2;
    }

    public static Double multiply(Double num1, Double num2){
        return  num1 * num2;
    }
}
