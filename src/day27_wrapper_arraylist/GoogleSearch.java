package day27_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 1,700,000,000 results (0.43 seconds)";
        String []  strArr = result.split(" ");
        System.out.println(Arrays.toString(strArr));




    }
}
