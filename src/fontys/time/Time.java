/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fontys.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Justin
 */
public class Time implements ITime {
    
    Calendar calendar = new GregorianCalendar();

    
    
    public Time(int y, int m, int d, int h, int min)
    {
        calendar.set(y, m, d, h, min);
    }

    

    
    @Override
    public int getYear() 
    {
     return calendar.getTime().getYear();

    }
    
    
    @Override
    public int compareTo(ITime t){
            throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMonth() {
        return calendar.getTime().getMonth() -1;
    }

    @Override
    public int getDay() {
        return calendar.getTime().getDay();
    }

    @Override
    public int getHours() {
        return calendar.getTime().getHours();
    }

    @Override
    public int getMinutes() {
        return calendar.getTime().getMinutes();
    }

    @Override
    public DayInWeek getDayInWeek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ITime plus(int minutes) {
        return new Time(this.getYear(), this.getMonth(), this.getDay(), this.getHours(), this.getMinutes() +minutes);
        
    }

    @Override
    public int difference(ITime time) {
        Calendar calendar2 =  new GregorianCalendar();
        calendar2.set(time.getYear(), time.getMonth(), time.getDay(), time.getHours(), time.getMinutes());
        calendar.getTime().getTime();
        
        int i = this.calendar.getTime().compareTo(calendar2.getTime());
        long difference = this.calendar.getTimeInMillis() - calendar2.getTimeInMillis();
        long differenceMinutes = difference / (60 * 1000) % 60; 
        if (i == 0) //same
        {
            return 0;
        }
        else if(i > 0) //higher
        {
            return (int)differenceMinutes;
        }
        else //lower
        {
            return (int)differenceMinutes;
        }
            //return (int)( - calendar2.getTime().getTime());//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
