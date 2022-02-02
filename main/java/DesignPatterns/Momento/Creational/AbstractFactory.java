package DesignPatterns.Momento.Creational;
/*
* One level above factory method creates abstract class for creating families of related without specifying concrete subclass
* factory of factory
* */

interface Bank{
    String getBankname();
}
class SBI implements Bank{
    private final String Bname;
    public SBI(String bank){
        Bname=bank;
    }
    public String getBankname(){
        return this.Bname;
    }

}
class Hdfc implements Bank{
    private final String Bname;
    public Hdfc(String bank){
        Bname=bank;
    }
    public String getBankname(){
        return this.Bname;
    }

}
abstract class Loan{
    protected double rate;
    abstract void getInterst(double rate);
    public void CalculateLoan(double loanamt,int yr){
        double Emi;
        int n=yr*12;
        rate=rate/1200;
        Emi=((rate*Math.pow((1+rate),n))/((Math.pow(1+rate,n))-1))*loanamt;
        System.out.println(Emi);
    }
}
class HomeLoan extends Loan{
    public void getInterst(double r){
        rate=r;
    }
}
class EducationLoan extends Loan{
    public void getInterst(double r){
        rate=r;
    }
}
abstract class AbstractFact{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
class BankFactory extends AbstractFact{
    public Bank getBank(String bank){
        if(bank=="sbi")return new SBI("SBI");
        else if(bank=="hdfc")return new Hdfc("hdfc");
        else return null;
    }
    public Loan getLoan(String l){
        return null;
    }
}
class LoanFactory extends AbstractFact{
    public Bank getBank(String b){
        return null;
    }
    public Loan getLoan(String loan){
        if(loan=="homeloan")return new HomeLoan();
        else return new EducationLoan();
    }
}
public class AbstractFactory {

}
