package com.kaizen.CodingExercises.Inheritance;

public class Carpet {
    private double cost;
    
    public Carpet(double cost){
        this.cost = cost;
        if(cost < 0 ){
            cost = 0;
        }this.cost = cost;
    }
    
    public double getCost(){
        return cost;
    }
}
