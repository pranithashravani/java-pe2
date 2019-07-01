package com.stackroute.junitdemo2;
import java.io.*;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {

        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader("/home/pranitha/junitdemo2/src/main/java/com/stackroute/junitdemo2/convert.txt");

        int i;
        int count=0;
        while ((i = fr.read()) != -1) {
            count++;
            System.out.println((Character.toUpperCase((char) i)));

        }
        System.out.println(count);
    }
}
