package DesignPrinciples;
/*
*
Design Principles are basic rules which every software engineer should follow
these are guides how to solve design problems:
* Single responsibility: A class should focus on single problem only
* Open/Closed principle: class should be open to extension closed to modification
* Liskov substitution: The base class should be such that its derived class can be substituted
* Interface segregation: The interface should not be big
* Dependency Inversion: Loosely couples class with dependency injection
* DRY: don't repeat you self
* Keep it simple, stupid
* Interface and base class can hold the object of extends or implemented class
*
*
* */
public class SOLID {
    //For SOLI you need to think for a solution keeping them in mind or refer
    //https://www.baeldung.com/solid-principles#d
    // Example of dependency Inversion

    public void main(){
        //consider this as main
        Keyborad mac=new Mackeyborad();

        Windows win=new Windows(mac);
        win.print();
    }

    public interface Keyborad{
        void getkeys();
    }
    public class Mackeyborad implements Keyborad{
        @Override
       public void getkeys(){
            System.out.println("Mackeys");
        }
    }
    public class WindowsKeyboard implements Keyborad{
        @Override
        public void getkeys(){
            System.out.println("Windkeys");
        }
    }
    public class Windows{
        private final Keyborad keyborad;
        public Windows(Keyborad keys){
            keyborad=keys;
        }
        public void print(){
            keyborad.getkeys();
        }
    }




}
