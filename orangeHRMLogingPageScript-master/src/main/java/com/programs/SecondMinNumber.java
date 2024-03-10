package com.programs;

public class SecondMinNumber {
    public static void main(String[] args){
        int [] arr = {7, 3, 5, 2, 8, 4};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        System.out.println("The minimum value is " + min);
        System.out.println("The second min value is " + secondMin);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum number.");
        } else {
            System.out.println("Second minimum number: " + secondMin);
        }
    }
}

