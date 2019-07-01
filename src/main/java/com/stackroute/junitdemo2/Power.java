package com.stackroute.junitdemo2;

public class Power {
    public String ispower(int input)
    {
        if(input ==0 )
            return "false";
        while(input != 1)
        {
            if(input % 4 != 0)
                return "false";
            input/=4;
        }
        return "true";
    }


}
