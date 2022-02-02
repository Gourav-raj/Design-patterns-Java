package DesignPatterns.Momento.Creational;

// only one instance can  be created

class complex{
    private int a,b;
    complex(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int getx(){
        return a;
    }
}
class SingletonInstance{

    private static complex instance;
    private SingletonInstance(){
    }
    public static complex getInstance(int a,int b){
        if(instance==null){
            instance=new complex(a,b);
        }
        return instance;
    }

}



public class Singleton {
    public static void main(String[] args) {
        complex s1 = SingletonInstance.getInstance(1,2);
        System.out.println(s1.getx());
        complex s2 = SingletonInstance.getInstance(3,4);
        System.out.println(s2.getx());
    }
}
