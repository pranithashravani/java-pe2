package com.stackroute.junitdemo2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FactorialTest {
    Factorial testobj;
    @Before
    public void setUp(){
        testobj=new Factorial();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testfindfactorial(){
        long result=testobj.findFactorial(20);
        assertEquals(2432902008176640000L,result);
    }
    @Test
    public void testFindfactorialFailure(){
        long result=testobj.findFactorial(-3);
        assertEquals(-6,result);
    }
    @Test
    public void testfindfactorial1(){
        long result=testobj.findFactorial(21);
        assertEquals(2432902008176640000L,result);
    }
    @Test
    public void testfindfactorial2(){
        long result=testobj.findFactorial(-5);
        assertEquals(-120,result);
    }
}