import DesignPrinciples.SOLID;
import OOPS.Encapsulation;
import OOPS.Polymorphism;

public class gourav {
    public static void main(String[] arr){
        SOLID s=new SOLID();
       // s.main();
        System.out.println("Hello from Main");

        SOLID e=new Encapsulation();
       // e.print();
        e.main();
        Keyboard macKeybord=new MacKeybord();
        Windows wind=new Windows(macKeybord);
        wind.print();

        Polymorphism p=new Polymorphism();
        p.main();
    }

    public interface Keyboard{
        void printKeys();
    }

    public static class MacKeybord implements Keyboard{
        public void printKeys(){
            System.out.println("MacKeyBoard");
        }
    }

    public static class Windows{
        private final Keyboard keyboard;

        public Windows(Keyboard keyboard) {
            this.keyboard = keyboard;
        }
        public void print(){
            keyboard.printKeys();
        }
    }


}
