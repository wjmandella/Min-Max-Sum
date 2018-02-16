// My solution to the HackerRank.com problem "Mini-Max Sum."
// https://www.hackerrank.com/challenges/mini-max-sum/problem

// Given five positive integers, find the minimum and maximum values 
// that can be calculated by summing exactly four of the five integers. 
// Then print the respective minimum and maximum values as a single line 
// of two space-separated long integers.

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumApp {

    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	int minSum = 0;
    	int maxSum = 0;
        for(int i=0; i<arr.length-1; i++) {
        	minSum += arr[i];
        	maxSum += arr[i+1];
        }
        
    	System.out.println(Arrays.toString(arr));
    	System.out.println("Min Sum: " + minSum);
    	System.out.println("Max Sum: " + maxSum);   	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
        	System.out.print("Enter an integer:");
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
