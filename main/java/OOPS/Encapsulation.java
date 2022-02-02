package OOPS;

import DesignPrinciples.SOLID;

public class Encapsulation extends SOLID {

    private int amount;
    public Encapsulation(){
    }
    public Encapsulation(int amount){
        this.amount=amount;
    }
    public void deposite(int val){
        if(val>=0)amount+=val;
        else{
            //throw exception
        }
    }
    public void print(){
        System.out.println("Hello From Encapsulation");
    }
}
