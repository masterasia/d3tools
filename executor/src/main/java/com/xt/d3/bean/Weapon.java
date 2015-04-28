package com.xt.d3.bean;

/**
 * Created by Administrator on 2015/4/28.
 */
public class Weapon implements Comparable{
    private String whiteDamage;

    private String mainParam;

    private String ed;

    private String speed;

    private String elementDamage;

    private String eliteDamage;

    private boolean hole;

    public String getWhiteDamage() {
        return whiteDamage;
    }

    public void setWhiteDamage(String whiteDamage) {
        this.whiteDamage = whiteDamage;
    }

    public String getMainParam() {
        return mainParam;
    }

    public void setMainParam(String mainParam) {
        this.mainParam = mainParam;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getElementDamage() {
        return elementDamage;
    }

    public void setElementDamage(String elementDamage) {
        this.elementDamage = elementDamage;
    }

    public String getEliteDamage() {
        return eliteDamage;
    }

    public void setEliteDamage(String eliteDamage) {
        this.eliteDamage = eliteDamage;
    }

    public boolean isHole() {
        return hole;
    }

    public void setHole(boolean hole) {
        this.hole = hole;
    }

    public int compareTo(Object o) {
        if (!Weapon.class.isInstance(0))
            return 0;

        return 0;
    }
}
