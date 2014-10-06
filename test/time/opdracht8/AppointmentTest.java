/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time.opdracht8;

import dummy.Appointment;
import fontys.time.Contact;
import fontys.time.IPeriod;
import fontys.time.ITime;
import fontys.time.Period;
import fontys.time.Time;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan-KuroTenshi
 */
public class AppointmentTest {
    
    private Contact c1;
    private Contact c2;
    static IPeriod p1, p2, p3;
    static ITime bt1 = new Time(1999,2,2,2,30);
    static ITime bt2 = new Time(1999,2,2,3,0);
    static ITime bt3 = new Time(1999,2,2,3,5);
    
    static ITime et1 = new Time(1999,2,2,3,0);
    static ITime et2 = new Time(1999,2,2,4,0);
    static ITime et3 = new Time(1999,2,2,3,8);
    private Appointment app1;
    private Appointment app2;
    private Appointment app3;
    
    public AppointmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1 = new Contact("Ryan");
        c2 = new Contact("Justin");
        
        p1 = new Period(bt1, et1);
        p2 = new Period(bt2, et2);
        p3 = new Period(bt3, et3);
        
        app1 = new Appointment("English", p1);
        app2 = new Appointment("Math", p3);
        app3 = new Appointment("Math", p3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSubject method, of class Appointment.
     */
    @Test
    public void testGetSubject() {
        System.out.println("getSubject");
        Appointment instance = null;
        String expResult = "";
        String result = instance.getSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeriod method, of class Appointment.
     */
    @Test
    public void testGetPeriod() {
        System.out.println("getPeriod");
        Appointment instance = null;
        IPeriod expResult = null;
        IPeriod result = instance.getPeriod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Invitees method, of class Appointment.
     */
    @Test
    public void testInvitees() {
        System.out.println("Invitees");
        Appointment instance = null;
        Iterator<Contact> expResult = null;
        Iterator<Contact> result = instance.Invitees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addContact method, of class Appointment.
     */
    @Test
    public void testAddContact() {
        System.out.println("addContact");
        Contact c = null;
        Appointment instance = null;
        Boolean expResult = null;
        Boolean result = instance.addContact(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeContact method, of class Appointment.
     */
    @Test
    public void testRemoveContact() {
        System.out.println("removeContact");
        Contact c = null;
        Appointment instance = null;
        instance.removeContact(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
