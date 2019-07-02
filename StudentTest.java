package com.stackroute.junitdemo2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StudentTest {
    Student test;
    @Before
    public void setUp(){
        test=new Student();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void givenAllMarksInRangeReturnCorrect() {

        int array[] = {62, 23, 34};
        String actual = test.check(array, 3);

        assertEquals("All marks are correct", actual);
    }
    @Test
    public void checkFailure() {

        int array[] = {62, 23, 134};
        String actual = test.check(array, 3);

        assertEquals( "Error", actual);
    }
    @Test
    public void checkZeroesCase(){
        int array[] = {0,0,0,0};
        String actual = test.check(array, 3);

        assertEquals( "Error", actual);

    }
    @Test
    public void checkNegativeCase(){
        int array[] = {3,4,-2,-1};
        String actual = test.check(array, 3);

        assertEquals( "Error", actual);

    }

}