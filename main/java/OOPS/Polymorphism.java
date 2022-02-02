package OOPS;

public class Polymorphism {

    public void main(){
        base b=new derived(); //in java virtual keyword is already enabled thus will do runtime evaluation so print derived class
        b.print();
    }

    public class base{
        public void print(){
            System.out.println("Base");
        }
    }
    public class derived extends base{
        public void print(){
            System.out.println("Derived");
        }
    }
}
