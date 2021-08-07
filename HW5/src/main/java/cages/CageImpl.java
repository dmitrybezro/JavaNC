package cages;

import model.Cage;
import model.Condition;

import java.util.Date;

public class CageImpl implements Cage {
    private final double width;
    private final double height;
    private boolean vacant;
    private final ConditionImpl condition;
    private Date inDate;


    public Date getInDate(){ return inDate;}
    public void setInDate(Date date) {this.inDate = date;}

    public CageImpl(double width, double height) {
        this.width = width;
        this.height = height;
        condition = new ConditionImpl(width, height);
        vacant = true;
    }

    public void setVacant(boolean bool) {
        this.vacant = bool;
    }

    @Override
    public int getNumber() {
        return this.hashCode();
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public boolean isVacantCage() {
        return this.vacant;
    }

}
