package DesignPatterns.Momento.Behavioral;
interface Connection {

    public void open();
    public void close();
    public void log();
    public void update();
}
class Accounting implements Connection {

    @Override
    public void open() {
        System.out.println("open database for accounting");
    }
    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Accounting has been updated");
    }
}
class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("open database for sales");
    }
    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }

}
class Management implements Connection {

    @Override
    public void open() {
        System.out.println("open database for Management");
    }
    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Management has been updated");
    }

}
class Controller {

    public static Accounting acct;
    public static Sales sales;
    public static Management management;

    private static Connection con;

    Controller() {
        acct = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection() {
        con = acct;
    }
    public void setSalesConnection() {
        con  = sales;
    }
    public void setManagementConnection() {
        con  = management;
    }
    public void open() {
        con .open();
    }
    public void close() {
        con .close();
    }
    public void log() {
        con .log();
    }
    public void update() {
        con .update();
    }

    public static class State {


            Controller controller;
            State(String con) {
                controller = new Controller();
                //the following trigger should be made by the user
                if(con.equalsIgnoreCase("management"))
                    controller.setManagementConnection();
                if(con.equalsIgnoreCase("sales"))
                    controller.setSalesConnection();
                if(con.equalsIgnoreCase("accounting"))
                    controller.setAccountingConnection();
                controller.open();
                controller.log();
                controller.close();
                controller.update();
            }


            public static void main(String args[]) {

                new State(args[0]);

            }
        }
}
