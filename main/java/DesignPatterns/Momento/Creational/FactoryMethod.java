package DesignPatterns.Momento.Creational;

/*
* The idea is to make class loosely coupled by letting users to choose the type of object required
* */

abstract class Vehicles{
     public abstract int getWheels();

     public String toString(){
         return "Wheel: "+ this.getWheels();
     }
}
class Car extends Vehicles{
    int wheel;
    public Car(int wheel){
        this.wheel=wheel;
    }
    @Override
    public int getWheels(){
        return this.wheel;
    }
}
class bike extends Vehicles{
    int wheel;
    public bike(int wheel){
        this.wheel=wheel;
    }

    @Override
    public int getWheels(){
        return this.wheel;
    }
}
class VehicleFactor{
    public Vehicles getInstance(String type,int wheel){
        if(type=="Car"){
            return new Car(wheel);
        }else if(type=="bike"){
            return new bike(wheel);
        }else{
            return null;
        }
    }
}
public class FactoryMethod {
    public static void main(String[] args){
        VehicleFactor factory=new VehicleFactor();
        Vehicles v1= factory.getInstance("Car",4);
        System.out.println(v1);
        Vehicles v2=factory.getInstance("bike",2);
        System.out.println(v2);
    }
}
