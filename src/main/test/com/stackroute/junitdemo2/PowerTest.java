package com.stackroute.junitdemo2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power pw;

    @Before
    public void setup()
    {

        pw=new Power();
    }


    @After
    public void teardown()
    {

        pw=null;
    }
    @Test
    public void givenInputshouldbepower()
    {

        String res=pw.ispower(64);
        assertEquals("true",res);
    }
    @Test
    public void givenInputShouldbepowerfail()
    {

        String res=pw.ispower(30);
        assertEquals("false",res);
    }
    @Test
    public void givenInputShouldbepowerfail1()
    {

        String res=pw.ispower(-30);
        assertEquals("false",res);
    }
    @Test
    public void givenInputShouldbepowerfail2()
    {

        String res=pw.ispower(0);
        assertEquals("false",res);
    }
    @Test
    public void givenInputShouldbepowerfail3()
    {

        String res=pw.ispower(' ');
        assertEquals("false",res);
    }
}