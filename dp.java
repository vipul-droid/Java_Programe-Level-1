import java.util.*;

public class dp{
    
    // **********************Fibonacci ********************************
    
    // in recursion , similar function will call kore tha one time times, to avoid that we would code by DP
    public static int fib_rec(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }

        int fib1 = fib_rec(n-1);
        int fib2 = fib_rec(n-2);
        int Fibonacci = fib1 + fib2;
        return Fibonacci;
    }

    public static int fib_mem(int n, int []arr){
        // base case
        if(n==0 || n==1){
            arr[n] = n;
            return arr[n];
        }
        
        // if function value is already solve, then it retturn;
        if(arr[n] != 0){
            return arr[n];
        }

        int fib1 = fib_mem(n-1, arr);
        int fib2 = fib_mem(n-2, arr);
        int Fibonacci = fib1 + fib2;
 
        arr[n] = Fibonacci;

        return Fibonacci;
    }
    
    public static int fib_tab(int n, int [] tab){
        // Meaning of the cell- dp[i] have fibonacci valur i.e dp[i] = dp[i-1] + dp[i-2]
        // small problem is 0 and 1
        // Prerequisite
        tab[0] = 0;
        tab[1] = 1;

        for(int i=2; i< tab.length; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }

        return tab[tab.length-1];
    }

    public static void fib(){
        int n=10;
        // int res = fib_rec(n);
        int [] arr = new int [n+1];
        // int res = fib_mem(n, arr);
        // int res = fib_tab(n, arr);
        System.out.println(res);
    }


    // ********************************Climbs stairs********************************************

     public static int climbStairs_rec(int n){
         
     }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Calling question~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void ques(){
            fib();
    }
    
    public static void main(String[] args) {
        ques();   
    }
}