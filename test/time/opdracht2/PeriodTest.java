/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time.opdracht2;

import fontys.time.IPeriod;
import fontys.time.ITime;
import fontys.time.Period;
import fontys.time.Time;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Ryan SPECIFICATIE
 */
public class PeriodTest{
    
    static Period p1, p2, p3, p4, p5, p6;
    static Time bt1 = new Time(0,0,0,2,30);
    static Time bt2 = new Time(0,0,0,3,0);
    static Time bt3 = new Time(0,0,0,3,5);
    static Time bt4 = new Time(0,0,0,1,0);
    static Time bt5 = new Time(0,0,0,0,0);
    static Time bt6 = new Time(0,0,0,8,0);
    
    static Time et1 = new Time(0,0,0,3,0);
    static Time et2 = new Time(0,0,0,4,0);
    static Time et3 = new Time(0,0,0,3,8);
    static Time et4 = new Time(0,0,0,3,0);
    static Time et5 = new Time(0,0,0,1,0);
    static Time et6 = new Time(0,0,0,9,0);
    
    @BeforeClass
    public static void setUpClass() {
        p1 = new Period(bt1,et1);
        p2 = new Period(bt2,et2);
        p3 = new Period(bt3,et3);
        p4 = new Period(bt4,et4);
        p5 = new Period(bt5,et5);
        p6 = new Period(bt6,et6);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        p1.getBeginTime();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setBeginTime method, of class Period.
     */
    @Test
    public void testSetBeginTime() {
        /**
         * beginTime will be the new begin time of this period
         * @param beginTime must be earlier than the current end time
         * of this period
         */
        System.out.println("setBeginTime");
        ITime beginTime = null;
        Period instance = null;
        instance.setBeginTime(beginTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndTime method, of class Period.
     */
    @Test
    public void testSetEndTime() {
        /**
        * endTime will be the new end time of this period
        * @param beginTime must be later than the current begin time
        * of this period
        */
        System.out.println("setEndTime");
        ITime endTime = null;
        Period instance = null;
        instance.setEndTime(endTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Period.
     */
    @Test
    public void testMove() {
        /**
        * the begin and end time of this period will be moved up both with [minutes]
        * minutes
        * @param minutes (a negative value is allowed)
        */
        System.out.println("move");
        int minutes = 0;
        Period instance = null;
        instance.move(minutes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeLengthWith method, of class Period.
     */
    @Test
    public void testChangeLengthWith() {
        /**
        * the end time of this period will be moved up with [minutes] minutes
        * @param minutes  minutes + length of this period must be positive  
        */
        System.out.println("changeLengthWith");
        int minutes = 0;
        Period instance = null;
        instance.changeLengthWith(minutes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPartOf method, of class Period.
     */
    @Test
    public void testIsPartOf() {
        /**
        * 
        * @param period
        * @return true if all moments within this period are included within [period], 
        * otherwise false
        */
        System.out.println("isPartOf");
        IPeriod period = null;
        Period instance = null;
        boolean expResult = false;
        boolean result = instance.isPartOf(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unionWith method, of class Period.
     */
    @Test
    public void testUnionWith() {
        /**
        * 
        * @param period
        * @return if this period and [period] are consecutive or possess a
        * common intersection, then the smallest period p will be returned, 
        * for which this period and [period] are part of p, 
        * otherwise null will be returned 
        */
        System.out.println("unionWith");
        IPeriod period = null;
        Period instance = null;
        IPeriod expResult = null;
        IPeriod result = instance.unionWith(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intersectionWith method, of class Period.
     */
    @Test
    public void testIntersectionWith() {
        /**
        * 
        * @param period
        * @return the largest period which is part of this period 
        * and [period] will be returned; if the intersection is empty null will 
        * be returned
        */
        System.out.println("intersectionWith");
        IPeriod period = null;
        Period instance = null;
        IPeriod expResult = null;
        IPeriod result = instance.intersectionWith(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
