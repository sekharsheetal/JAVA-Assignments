/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sheetal Sekhar
 */
public class VitalSigns {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPresuure() {
        return bloodPresuure;
    }

    public void setBloodPresuure(double bloodPresuure) {
        this.bloodPresuure = bloodPresuure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private double bloodPresuure;
    private int pulse;
    private String date;
    
    
    @Override
    public String toString()
    {
    return this.date;
    }
    
}
