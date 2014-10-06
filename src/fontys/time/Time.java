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
        return calendar.get(GregorianCalendar.YEAR);     // SAME AS === return calendar.getTime().getYear() +1900;

    }
    
    
@Override
    public int compareTo(ITime t){
        Calendar calendar2 =  new GregorianCalendar();
        calendar2.set(t.getYear(), t.getMonth(), t.getDay(), t.getHours(), t.getMinutes());
       
        int i = this.calendar.getTime().compareTo(calendar2.getTime());
        return i;
    }

    @Override
    public int getMonth() {
        return calendar.get(GregorianCalendar.MONTH);
    }

    @Override
    public int getDay() {
        return calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public int getHours() {
        return calendar.get(GregorianCalendar.HOUR);
    }

    @Override
    public int getMinutes() {
        return calendar.get(GregorianCalendar.MINUTE);
    }

    @Override
    public DayInWeek getDayInWeek()
    
    {   
        int day = GregorianCalendar.DAY_OF_WEEK;
        DayInWeek diw = DayInWeek.SUN;
        switch (day)
        {
            case 1:
                diw = DayInWeek.SUN;
                break;
            case 2:
                diw = DayInWeek.MON;
                break;
            case 3:
                diw = DayInWeek.TUE;
                break;
            case 4:
                diw = DayInWeek.WED;
                break;
            case 5:
                diw = DayInWeek.THU;
                break;
            case 6:
                diw = DayInWeek.FRI;
                break;
            case 7:
                diw = DayInWeek.SAT;
                break;
                
                //SUN,MON,TUE,WED,THU,FRI,SAT;
        }
        return diw;
    }

    @Override
    public ITime plus(int minutes) {
        return new Time(this.getYear(), this.getMonth(), this.getDay(), this.getHours(), this.getMinutes() +minutes);
        
    }

    @Override
public int difference(ITime time) {
        Calendar calendar2 =  new GregorianCalendar();
        calendar2.set(time.getYear(), time.getMonth(), time.getDay(), time.getHours(), time.getMinutes());
        calendar.getTime();
       
        int i = this.calendar.getTime().compareTo(calendar2.getTime());
        long difference = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
        long differenceMinutes = difference / 60000;
        if (i == 0) //same
        {
            return 0;
        }
        else if(i > 0) //higher
        {
            return (int)differenceMinutes +1;
        }
        else //lower
        {
            return (int)differenceMinutes;
        }
            //return (int)( - calendar2.getTime().getTime());//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
