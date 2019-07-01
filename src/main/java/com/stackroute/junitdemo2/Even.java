package com.stackroute.junitdemo2;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int input;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the input");
        input = s.nextInt();
        iseven(input);


    }

    public static boolean iseven(int input) {
        if (input % 2 == 0)
           return true;
        else
          return false;

    }
}
