public class ShowInterest {
    void showIneterest(){
        double amount;
        double interest;

        amount = 1200.00;
        System.out.println("ammount: + amount");

        interest = 3.0;
        amount = amount * (100+interest)/100;
        System.out.println("after a year:" + amount);

        amount = amount * (100+interest)/100;
        System.out.println("after a year:" + amount);

    }

    public static void main(String[] args){
        (new ShowInterest()).showIneterest();
    }
}
