package com.programs;

public class MaxNumberInAnArray {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
