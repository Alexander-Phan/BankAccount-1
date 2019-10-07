import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BankAccount extends Measurable{
    public float balance = 0.f;
    public float rate;

    public BankAccount(float balance, float rate){
        this.balance = balance;
        this.rate = rate;
    }

    public static void main(String [] args) {

        BankAccount account = new BankAccount(1000f, .1f);
        BankAccount account2 = new BankAccount(0f, .1f);
        //System.out.println("balance after two years is: " + account.balance);
        BankAccount account3 = new BankAccount(2000f, .1f);
        ArrayList<Measurable> arr = new ArrayList<>();
        arr.add(account);
        arr.add(account2);
        arr.add(account3);
        System.out.println(arr);
        //Collections.sort(arr);
        System.out.println(arr);

        System.out.println(getAverage(arr));

    }

    public void processYear(){
        float interest = balance * rate;
        balance = balance + interest;
    }

    public void processNYear(int n){
        int i = 0;
        while (i < n){
            processYear();
            i += 1;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        BankAccount acc = (BankAccount)o;
//        if(balance > acc.balance){
//            return 1;
//        }else if(balance == acc.balance){
//            return 0;
//        }else{
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return "balance=" + balance;
    }

    public float getMeasure() {
        return balance;
    }


}