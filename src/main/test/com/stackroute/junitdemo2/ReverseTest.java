package com.stackroute.junitdemo2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse rev;
    @Before
    public void setup()
    {
        rev=new Reverse();
    }
    @After
    public void teardown()
    {
        rev=null;
    }
    @Test
    public void giveninputshouldbepalindrome()
    {
        String res=rev.check(121);
        assertEquals("palindrome",res);

    }
    @Test
    public void giveninputshouldbepalindrome1()
    {
       int result=rev.reverse(122);
        assertEquals(221,result);
        String res=rev.check(221);
        assertEquals("not a palindrome",res);

    }
    @Test
    public void giveninputshouldbepalindrome2()
    {

        String res=rev.check(1);
        assertEquals("palindrome",res);

    }


}