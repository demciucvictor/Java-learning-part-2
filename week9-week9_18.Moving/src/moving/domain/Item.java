/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Computer
 */
public class Item implements Thing, Comparable<Item>{
    
    private String name;
    private int volume;

    public Item(String n, int v){
        this.name=n;
        this.volume=v;
    }
    @Override
    public int getVolume() {
        return volume;
    }
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item comparable){
        return this.getVolume()-comparable.getVolume();
    }
    
    
    
}
