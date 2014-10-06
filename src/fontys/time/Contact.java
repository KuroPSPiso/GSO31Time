/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fontys.time;

import dummy.Appointment;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ryan-KuroTenshi opdracht 6,8,10
 */
public class Contact {
    private String name;
    private ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
    
    public Contact(String name){
        this.name = name;
    }
    
    public String GetName()
    {
        return this.name;
    }
    
    //Package Method
    Boolean addAppointment(Appointment a){
        return a.addContact(this);
    }
    
    //Package Method
    void removeAppointment(Appointment a){
        a.removeContact(this);
    }
    
    public Iterator<Appointment> appointments()
    {
        return this.appointmentList.iterator();
    }
}
