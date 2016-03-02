/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sarra
 */
public class Orchestra {
    private List<IInstrument> instruments;
    private int numberOfInstruments;
    
    public Orchestra(){
        instruments = new LinkedList<IInstrument>();
        numberOfInstruments=0;
        
    }

    public Orchestra(List<IInstrument> instruments, int numberOfInstruments) {
        this.instruments = instruments;
        this.numberOfInstruments = numberOfInstruments;
    }
    
    public int getNumberOfInstruments(){
        return numberOfInstruments;
    }
    
    public void addInstrument(IInstrument i){
        if(i!=null){
            instruments.add(i);
            numberOfInstruments++;
        }
    }
    
    public List<String> makeMusic(){
        List<String> l = new LinkedList<String> ();
        for(IInstrument i : instruments){
            l.add(i.play());
        }
        return l;
    }
}
