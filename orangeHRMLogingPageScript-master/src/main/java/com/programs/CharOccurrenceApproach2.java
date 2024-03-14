package com.programs;

public class CharOccurrenceApproach2 {
    public   static int countCharOccurrence(String org_str,char ch){
        int count =0;
        for(int i=0;i<org_str.length();i++){
            if(org_str.charAt(i)==ch){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count=countCharOccurrence("Hello world Hello ",'l');
        System.out.println(count);
    }

}
