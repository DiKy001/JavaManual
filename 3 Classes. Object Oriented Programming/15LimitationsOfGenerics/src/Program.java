public class Program{

    public static void main(String[] args) {

        Account acc1 = new Account("1876", 4500);
        Account acc2 = new Account("3476", 1500);

        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();

        // Generic types as constraints
        Account2<String> acc3 = new Account2<String>("1876", 4500);
        Account2<String> acc4 = new Account2<String>("3476", 1500);

        Transaction2<Account2<String>> tran2 = new Transaction2<Account2<String>>(acc3,acc4, 4000);
        tran2.execute();
        tran2 = new Transaction2<Account2<String>>(acc3,acc4, 4000);
        tran2.execute();

        // Interfaces as constraints
        Account3 acc5 = new Account3("1235rwr", 5000);
        Account3 acc6 = new Account3("2373", 4300);
        Transaction3<Account3> tran3 = new Transaction3<Account3>(acc5, acc6, 1560);
        tran3.execute();
    }
}
class Transaction<T extends Account>{

    private T from;     // from which account the transfer
    private T to;       // to which account the transfer
    private int sum;    // transfer amount

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
class Account{

    private String id;
    private int sum;

    Account(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class Transaction2<T extends Account2<String>>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction2(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
class Account2<T> {

    private T id;
    private int sum;

    Account2(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

interface Accountable{
    String getId();
    int getSum();
    void setSum(int sum);
}
class Account3 implements Accountable{

    private String id;
    private int sum;

    Account3(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
class Transaction3<T extends Accountable>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction3(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}