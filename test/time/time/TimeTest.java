/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time.time;

import fontys.time.DayInWeek;
import fontys.time.ITime;
import fontys.time.Time;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class TimeTest {
    static Time time1 = new Time(1998,2,2,2,30);
    static Time time2 = new Time(1998,2,2,2,30);
    static Time time3 = new Time(1998,2,2,3,30); //time differece 
    static Time time4 = new Time(1998,2,2,2,35); //+5 minutes
    
    
    //TEST VARIABLE
    int y = 1998;       //year
    int m = 2;          //month
    int d = 2;          //day
    int h = 2;          //hour
    int diw = 3;
    int min = 30;       //minutes
    int difference = -60; // difference in minutes between 2 times
    
    public TimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getYear method, of class Time.
     */
    @Test
    public void testGetYear() {
        
        System.out.println("getYear");
        Time instance = time1;
        int expResult = y;
        int result = instance.getYear();
        assertEquals(expResult, result);

    }



    /**
     * Test of compareTo method, of class Time.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ITime t = null;
        Time instance = time1;
        int expResult = -1;
        int result = instance.compareTo(time2);
        assertEquals(expResult, result);

    }

    /**
     * Test of getMonth method, of class Time.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Time instance = time1;
        int expResult = m;
        int result = instance.getMonth();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDay method, of class Time.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Time instance = time1;
        int expResult = d;
        int result = instance.getDay();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Time instance = time1;
        int expResult = h;
        int result = instance.getHours();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Time instance = time1;
        int expResult = min;
        int result = instance.getMinutes();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDayInWeek method, of class Time.
     */
    @Test
    public void testGetDayInWeek() {
        System.out.println("getDayInWeek");
        Time instance = time1;
        DayInWeek expResult = null;
        DayInWeek result = instance.getDayInWeek();
        assertEquals(expResult, result);

    }

    /**
     * Test of plus method, of class Time.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int minutes = 5;
        Time instance = time1;
        ITime expResult = time4;
        ITime result = instance.plus(minutes);
        assertEquals(expResult.getMinutes(), result.getMinutes());

    }

    /**
     * Test of difference method, of class Time.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        ITime time = null;
        Time instance = time1;
        int expResult = difference;
        int result = instance.difference(time3);
        assertEquals(expResult, result);

    }
    
}
