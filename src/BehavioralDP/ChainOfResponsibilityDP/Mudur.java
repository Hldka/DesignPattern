package BehavioralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<500){
            System.out.println("Müdür onayladi");
            System.out.println("********************");
        }else if (chief!=null){
            System.out.println("Miktar müdürün onaylama siniri disinda , Genel müdür'e yönlendiriliyorsunuz ");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
