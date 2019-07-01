package com.stackroute.junitdemo2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {
    Even ev;
    @Before
        public void setup()
        {
            Even ev=new Even();
        }
        @After
        public void teardown()
        {
            ev=null;
        }

    @Test
    public void set()
    {
        ev=new Even();
    }
    public void giveninputreturneven()
    {

        boolean res=ev.iseven(2);
        assertEquals(true,res);
    }
    @Test
    public void giveninputreturnodd()
    {

        boolean res=ev.iseven(3);
        assertEquals(false,res);
    }
    @Test
    public void giveninputreturneven1()
    {

        boolean res=ev.iseven(-4);
        assertEquals(true,res);
    }
    @Test
    public void giveninputreturnodd1()
    {

        boolean res=ev.iseven(39999999);
        assertEquals(false,res);
    }
}