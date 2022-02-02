package DesignPatterns.Momento.Structural;

// converts the interface of class into another that user wants
interface Bird
{
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird
{
    public void fly()
    {
        System.out.println("Flying");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
}

interface ToyDuck
{

    public void squeak();
}

class PlasticToyDuck implements ToyDuck
{
    public void squeak()
    {
        System.out.println("Squeak");
    }
}

class BirdAdapter implements ToyDuck
{

    Bird bird;
    public BirdAdapter(Bird bird)
    {

        this.bird = bird;
    }

    public void squeak()
    {

        bird.makeSound();
    }
}

public class Adaptive {
    public static void main(String[] args){
        Sparrow b1=new Sparrow() ;
        PlasticToyDuck t1=new PlasticToyDuck();
        BirdAdapter adapt=new BirdAdapter(b1);
        adapt.squeak();// which internally calls makesound of birds thus makes it compatible to toys compatible


    }
}
