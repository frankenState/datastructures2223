/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M2L2;

/**
 *
 * @author frank lou
 */
public class RecursionExamples {
    
    public static long fib(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
    
    public static boolean isPalindrome(String s){
        if (s.length() <=1) return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        else return isPalindrome(s.substring(1, s.length() - 1));
    }
    
    public static long factorial(int n){
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
//        System.out.println("3! = " + factorial(3));
//        System.out.println("5! = " + factorial(5));
//        System.out.println("f(6) = " + fib(6));
//        System.out.println("f(5) = " + fib(5));
//        
//        System.out.println("racecar => " + isPalindrome("racecar"));
//        System.out.println("world => " + isPalindrome("world"));

    
          printMe("Hi", 5);
        
    }
    
    public static void printMe(String str, int times){
        // base case
        if (times > 0){
           System.out.println(times + ") " + str);
           printMe(str, times - 1);
        }
    }
    
}
