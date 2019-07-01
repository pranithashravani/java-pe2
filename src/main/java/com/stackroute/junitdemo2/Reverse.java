package com.stackroute.junitdemo2;

public class Reverse {
    public int reverse(int number){
        int mod=0,sum=0;
        while(number>0) {
            mod = number % 10;
            sum = sum * 10 + mod;
            number/=10;
        }
        return sum;
    }
    public String check(int number){
        int rev=reverse(number);
        String output;
        if(number==rev){
            output="palindrome";

        }
        else{
            output="not a palindrome";
        }
        return output;
    }
}
