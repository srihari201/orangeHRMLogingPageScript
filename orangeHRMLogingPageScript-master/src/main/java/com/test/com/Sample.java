package com.test.com;

public class Sample {
    public static void main(String args[]){
        int [] arr = {7, 3, 5, 2, 8, 4,1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){//
            if(arr[i]<min){//5<3,2<3,
                min=arr[i];//3,
            }

        }
        System.out.println(min);//3






    }

}
