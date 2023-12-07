package pl.javastart.task;

import com.sun.source.tree.BreakTree;

public class Room {
    private double livingArea;
    private double currentTemperature;
    private boolean airConditioning;
    private double limitTemperature;

    public Room(double livingArea, double currentTemperature, boolean airConditioning, double limitTemperature) {
        this.livingArea = livingArea;
        this.currentTemperature = currentTemperature;
        this.airConditioning = airConditioning;
        this.limitTemperature = limitTemperature;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public double getLimitTemperature() {
        return limitTemperature;
    }

    public void setLimitTemperature(double limitTemperature) {
        this.limitTemperature = limitTemperature;
    }

    boolean decreaseTemperature() {

        if ((currentTemperature) == (limitTemperature + 0.5) && airConditioning) {
            currentTemperature = currentTemperature - 0.5;
            return true;
        } else if ((currentTemperature) > (limitTemperature) && airConditioning) {
            currentTemperature = currentTemperature - 1;
            return true;
        }

        if ((currentTemperature) == (limitTemperature) || !airConditioning) {
            return false;
        }
        return true;
    }
}

