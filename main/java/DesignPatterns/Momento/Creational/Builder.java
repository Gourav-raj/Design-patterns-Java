package DesignPatterns.Momento.Creational;
// to many arguments in constructor as
// well some are optional parameters as well don't have to
// remember the sequence of args

class Phone{
    private String os,processor,screen;
    private int battery,camera;

    public Phone(String os, String processor, String screen, int battery, int camera) {
        this.os = os;
        this.processor = processor;
        this.screen = screen;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screen='" + screen + '\'' +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
class PhoneBuilder{
    private String os,processor,screen;
    private int battery,camera;

    public void setOs(String os) {
        this.os = os;
        // return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,processor,screen,battery,camera);
    }
}

public class Builder {
    public static void  main(String[] args){
        PhoneBuilder build=new PhoneBuilder();
        build.setBattery(90);

        build.setOs("mac");
        build.setCamera(20);
        Phone p=build.getPhone();
        System.out.println(p);
    }
}
