/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Sarra
 */
public class Flute implements IInstrument{

    
    private int soundVolume;

    public Flute() {
        this(10);
    }

    public Flute(int soundVolume) {
        this.soundVolume = soundVolume;
    }
    
    
    
    public int getSoundVolume(){
        return soundVolume;
    }
    @Override
    public String play() {
               
        return("trilili");
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
