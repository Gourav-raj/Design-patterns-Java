package OOPS;

public class Abstraction {
    public void sendMail(){ //for  user interface only sendMail is available
        connect();
        authenticate();
        System.out.println("Sending mail");
        teminate();
    }
//    public void connect(){
    private void connect(){  //this is abstraction hiding the complex behind the scene process
    }
    private void authenticate(){

    }
    private void teminate(){

    }
}
