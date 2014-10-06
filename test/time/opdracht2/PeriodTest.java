/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time.opdracht2;

import com.oracle.jrockit.jfr.InvalidValueException;
import fontys.time.IPeriod;
import fontys.time.ITime;
import fontys.time.Period;
import fontys.time.Time;
import junit.framework.Assert;
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
    static Time bt1 = new Time(1999,2,2,2,30);
    static Time bt2 = new Time(1999,2,2,3,0);
    static Time bt3 = new Time(1999,2,2,3,5);
    static Time bt4 = new Time(1999,2,2,1,0);
    static Time bt5 = new Time(1999,2,2,0,0);
    static Time bt6 = new Time(1999,2,2,8,0);
    
    static Time et1 = new Time(1999,2,2,3,0);
    static Time et2 = new Time(1999,2,2,4,0);
    static Time et3 = new Time(1999,2,2,3,8);
    static Time et4 = new Time(1999,2,2,3,0);
    static Time et5 = new Time(1999,2,2,1,0);
    static Time et6 = new Time(1999,2,2,9,0);
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p1 = new Period(bt1,et1);
        p2 = new Period(bt2,et2);
        p3 = new Period(bt3,et3);
        p4 = new Period(bt4,et4);
        p5 = new Period(bt5,et5);
        p6 = new Period(bt6,et6);
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
        System.out.println("setBeginTime: start");
        Time beginTime = new Time(1999,2,2,0,1);
        Time newBeginTime = new Time(1999,2,2,1,0);
        Time beginTimeOOB = new Time(1999,2,2,3,0);
        Time endTime = new Time(1999,2,2,2,0);
        Period instance = new Period(beginTime, endTime);
        
        instance.setBeginTime(newBeginTime);
        
        Assert.assertEquals("nieuwe begin tijd", newBeginTime, instance.getBeginTime());
        Assert.assertFalse("tijden zijn niet hetzelfde", (beginTime == instance.getBeginTime()));
        
        System.out.println("setBeginTime: succesfull");
    }
    
    @Test
    public void testPeriod()
    {
        /**
        *
        creation of a period with begin time bt and end time et
        * @param bt  begin time bt must be earlier than end time et
        * @param et
        */
        Time beginTime = new Time(1999,2,2,0,1);
        Time endTime = new Time(1999,2,2,2,0);
        Period instance = new Period(beginTime, endTime);
        
        Assert.assertNotNull("Geen begin aanwezig Period object is niet valide * difference was false", instance.getBeginTime());
        Assert.assertNotNull("Geen eindtijd aanwezig Period object is niet valide * difference was false", instance.getEndTime());
    }
    
    @Test(expected = InvalidValueException.class)
    public void testSetBeginTime1() {
        /**
         * beginTime will be the new begin time of this period
         * @param beginTime must be earlier than the current end time
         * of this period
         */
        Time beginTime = new Time(1999,2,2,0,1);
        Time beginTimeOOB = new Time(1999,2,2,3,0);
        Time endTime = new Time(1999,2,2,2,0);
        Period instance = new Period(beginTime, endTime);
        
        if(endTime == instance.getEndTime())
        {
            instance.setBeginTime(beginTimeOOB);
        }
        Assert.fail();
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
        System.out.println("setEndTime: start");
        Time beginTime = new Time(1999,2,2,0,1);
        Time endTime = new Time(1999,2,2,2,0);
        Time newEndTime = new Time(1999,2,2,1,0);
        Time endTimeOOB = new Time(1999,2,2,3,0); //out of bounds
        Period instance = new Period(beginTime, endTime);
        
        instance.setEndTime(newEndTime);
        
        Assert.assertEquals("nieuwe eind tijd", newEndTime, instance.getEndTime());
        Assert.assertFalse("tijden zijn niet hetzelfde", (endTime == instance.getEndTime()));
        
        System.out.println("setEndTime: succesfull");
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
        System.out.println("move: start");
        
        //add 5minutes.
        int minutes = 5;
        Time beginTime = new Time(1999,2,2,0,1);
        Time endTime = new Time(1999,2,2,2,0);
        Period instance = new Period(beginTime, endTime);
        
        instance.setBeginTime(beginTime);
        instance.setEndTime(endTime);
        
        Assert.assertEquals(instance.getEndTime(), endTime);
        
        instance.move(minutes);
        
        Assert.assertFalse((instance.getEndTime().difference(endTime) == 0));
        
        instance.move(-minutes);
        
        Assert.assertTrue((instance.getEndTime().difference(endTime) == 0));
        Assert.assertEquals(instance.getEndTime().getMinutes(), endTime.getMinutes());
        Assert.assertFalse(instance.getEndTime().getMinutes(), endTime.getMinutes());
        
        System.out.println("move: succesfull");
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
        System.out.println("changeLengthWith: start");
        int minutes = 0;
        Period instance = null;
        instance.changeLengthWith(minutes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("changeLengthWith: succesfull");
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
        System.out.println("isPartOf: start");
        IPeriod period = null;
        Period instance = null;
        boolean expResult = false;
        boolean result = instance.isPartOf(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("isPartOf: succesfull");
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
        System.out.println("unionWith: start");
        IPeriod period = null;
        Period instance = null;
        IPeriod expResult = null;
        IPeriod result = instance.unionWith(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("isPartOf: succesfull");
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
        System.out.println("intersectionWith: start");
        IPeriod period = null;
        Period instance = null;
        IPeriod expResult = null;
        IPeriod result = instance.intersectionWith(period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("intersectionWith: succesfull");
    }
}
