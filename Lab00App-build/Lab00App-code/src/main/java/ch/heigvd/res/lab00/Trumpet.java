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
public class Trumpet implements IInstrument{
    
    private int soundVolume;
    private String color;

 
    public Trumpet() {
        this(20,"golden");
    }
    public Trumpet(int soundVolume, String color) {
        this.soundVolume = soundVolume;
        this.color = color;
    }
 
    public int getSoundVolume(){
      return soundVolume;  
    }
    
    public String getColor(){
        return color;
}
    

    @Override
    public String play() {
        return("pouet"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
