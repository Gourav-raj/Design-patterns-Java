package OOPS;

public class Inheritance {

    public class Derivede extends baseClass{

        public Derivede(int n, int a) {
            super(n, a);
        }

    }
    public class baseClass{
        private int name,age;

        public baseClass(int n,int a){
            name=n;
            age=a;
        }
    }
}


