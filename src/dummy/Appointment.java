/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dummy;

import fontys.time.Contact;
import fontys.time.IPeriod;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ryan-KuroTenshi Opdracht 6,8,11 (per ongeluk)
 */
public class Appointment {
    private String subject = "";
    private IPeriod period;
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    /**
     *
     * @param subject
     * @param period
     */
    public Appointment(String subject, IPeriod period)
    {
        this.subject = subject;
        this.period = period;
    }
    
    /**
     *
     * @return
     */
    public String getSubject()
    {
        return this.subject;
    }
    
    /**
     *
     * @return
     */
    public IPeriod getPeriod()
    {
        return this.period;
    }
    
    /**
     *
     * @return
     */
    public Iterator<Contact> Invitees()
    {
        return this.contacts.iterator();
    }
    
    /**
     *
     * @param c  New Contact
     * @return
     */
    public Boolean addContact(Contact c)
    {
        Boolean canAddContact = true;
        Iterator<Appointment> contactAppointments = c.appointments();
        if(contactAppointments != null || contactAppointments != new ArrayList<Appointment>().iterator())
            while(contactAppointments.hasNext())
            {
                if(contactAppointments.equals(this))
                    canAddContact = false;

                //NextRow
                contactAppointments.next();
            }

        if(canAddContact)
        {
            this.contacts.add(c);
        }
        
        return canAddContact;
    }
    
    /**
     *
     * @param c Contact
     */
    public void removeContact(Contact c)
    {
        this.contacts.remove(c);
    }
}
