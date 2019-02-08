

import java.util.*;
public class NumberUtilities {
    
    public static String getRange(int stop) {
        String nums = "";
        for(int i=0;i<stop;i++){
            nums = nums+i;};
        
        return nums;}
    

    public static String getRange(int start, int stop) {
        String nums = "";
        for(int i=start;i<stop;i++){
            nums = nums+i;};
        return nums;
    }


    public static String getRange(int start, int stop, int step) {
        String nums = "";
        for(int i=start;i<stop;i=i+step){
            nums = nums+i;};
        
        return nums;
    }

    public static String getEvenNumbers(int start, int stop) {
        String nums = "";
        for(int i=start;i<stop;i++){
            if(i%2==0){
            nums = nums+i;};}
        
        return nums;
    }


    public static String getOddNumbers(int start, int stop) {
        String nums = "";
        for(int i=start;i<stop;i++){
            if(i % 2 != 0){
            nums = nums+i;}}
        
        return nums;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String nums = "";
        for(int i=start;i<=stop;i++){
            nums = nums+ (int) Math.pow(i,exponent);};
        
        return nums;
    }
}
