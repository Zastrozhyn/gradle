package ru.clevertec;

public class App {
    public static void main(String[] args){
        System.out.println(isPositiveNumber("101"));
    }

    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}
