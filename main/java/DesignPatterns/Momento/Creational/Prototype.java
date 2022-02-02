package DesignPatterns.Momento.Creational;

// Cloning the structure of some object instead of create new one from scratch

interface proto{
    public proto clone();
}
 class chess implements proto{
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public chess(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }
    public String getname(){
        return name;
    }

    public proto clone(){
        return new chess(id,name,designation,salary,address);
    }
}
public class Prototype {
    public static void main(String[] args) {
        chess c1 = new chess(1, "gourav", "chess", 90.32, "add");
        chess c2 = (chess) c1.clone();
        System.out.println(c2.getname());
    }

}
