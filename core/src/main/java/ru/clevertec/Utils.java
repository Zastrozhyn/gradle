package ru.clevertec;

import java.util.Arrays;

public class Utils {
    public boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(App::isPositiveNumber);
    }
}