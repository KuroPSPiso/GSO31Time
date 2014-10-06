/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fontys.time;

import com.oracle.jrockit.jfr.InvalidValueException;


/**
 *
 * @author Ryan-KuroTenshi
 */
public class Period implements IPeriod{
    
    ITime bt = null;
    ITime et = null;
    
    /**
    *
    creation of a period with begin time bt and end time et
    * @param bt  begin time bt must be earlier than end time et
    * @param et
    */
    public Period(ITime bt, ITime et)
    {
        if(bt.difference(et) < 0 )
        {
            this.bt = bt;
            this.et = et;
        }
    }

    @Override
    public ITime getBeginTime() {
        return this.bt;
    }

    @Override
    public ITime getEndTime() {
        return this.et;
    }

    @Override
    public int length() {
        return Math.abs(bt.difference(et));
    }

    @Override
    public void setBeginTime(ITime beginTime)  {
        try
        {
            validateSetBeginTime(beginTime.difference(this.et));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.bt = beginTime;
        }
    }
    
    public void validateSetBeginTime(int i) throws InvalidValueException
    {
        if(i > 0)
        {
            throw new InvalidValueException("Begin time is before end time");
        }
    }

    @Override
    public void setEndTime(ITime endTime) {
        this.et = endTime;
    }

    @Override
    public void move(int minutes) {
        this.et = this.et.plus(minutes);
        this.bt = this.bt.plus(minutes);
    }

    @Override
    public void changeLengthWith(int minutes) {
        this.et.plus(minutes);
    }

    @Override
    public boolean isPartOf(IPeriod period) {
        if(     (bt.difference(period.getBeginTime()) > 0 &&
                et.difference(period.getEndTime()) < 0 ) 
                ||
                (et.difference(period.getEndTime()) > 0 &&
                bt.difference(period.getBeginTime()) < 0 )
                )
        {
            return true;
        }
        return false;
    }

    @Override
    public IPeriod unionWith(IPeriod period) {
        ITime bt1 = this.bt;
        ITime bt2 = period.getBeginTime();
        ITime et1 = this.et; 
        ITime et2 = period.getEndTime();
        Boolean bt1First = true;
        Boolean isMergable = false;
        
        Period pResult = null;
        
        if(bt1.difference(bt2) > 0)
            bt1First = true;
        else 
            bt1First = false;
        
        if(bt1First)
        {
            if(et1.equals(bt2))// || ( et1 > bt2 && et2 > et1 && bt1 < bt2))
            {
                
            }
        }
        else
        {
            if(et2.equals(bt1))
            {
                
            }
        }
        
        return pResult;
    }

    @Override
    public IPeriod intersectionWith(IPeriod period) {
        ITime bt1 = this.bt;
        ITime bt2 = period.getBeginTime();
        ITime et1 = this.et; 
        ITime et2 = period.getEndTime();
        Boolean bt1First = true;
        
        Period pResult = null;
        
        if(bt1.difference(bt2) > 0)
            bt1First = true;
        else 
            bt1First = false;
        
        if(bt1First)
        {
            if(false)// || ( et1 > bt2 && et2 > et1 && bt1 < bt2))
            {
                
            }
        }
        else
        {
            
        }
        
        return pResult;
    }
    
    /*intersection = doorsnede | tussen 2 periodes | = gemeenschappelijk del van 2 periodes / overlap = intersection
    
    |_____________|bt1___________|BT2___(overlap)___|et1___________|ET2______________|
    
    |   bt1 < bt2                   |
    |   et2 > et1                   |
    |   [et1 > bt2 = has overlap]   | [bt2, et1] result /// if no overlap ret null;
    
    p1.intersectwith(p2);
    */
    
    /*
    union = totale aangeslote periode als je 2 periodes samenneemt ... IF overlap Tenzij begin2 = eind1 en visa versa;
    
    result is bt1 t/m et2 orz...;
    */
}
