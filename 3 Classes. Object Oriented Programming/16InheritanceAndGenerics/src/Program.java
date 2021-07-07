public class Program {
    public static void main(String[] args) {
        // Base generic class
        DepositAccount1<Integer> dAccount1 = new DepositAccount1<>(20);
        System.out.println(dAccount1.getId());
        DepositAccount1<String> dAccount2 = new DepositAccount1<>("12345");
        System.out.println(dAccount2.getId());

        DepositAccount2<Integer, String> dAccount3 = new DepositAccount2<>(20, "Tom");
        System.out.println(dAccount3.getId() + " : " + dAccount3.getName());
        DepositAccount2<String, Integer> dAccount4 = new DepositAccount2<>("12345", 23456);
        System.out.println(dAccount4.getId() + " : " + dAccount4.getName());

        DepositAccount3 dAccount5 = new DepositAccount3();
        System.out.println(dAccount5.getId());

        // Generalized inheritor class
        DepositAccount4<Integer> dAccount6 = new DepositAccount4<>("Tom", 20);
        System.out.println(dAccount6.getId());

        // Generic Type Conversion
        DepositAccount1<Integer> depAccount = new DepositAccount1(10);
        Account1<Integer> account = (Account1<Integer>)depAccount;
        System.out.println(account.getId());

        /* Error
        DepositAccount1<Integer> depAccount7 = new DepositAccount1(10);
        Account1<String> account1 = (Account1<String>)depAccount;*/
    }
}

class Account1<T>
{
    private T _id;
    T getId(){return _id;}
    Account1(T id)
    {
        _id = id;
    }
}

class DepositAccount1<T> extends Account1<T>{

    DepositAccount1(T id){
        super(id);
    }
}

class DepositAccount2<T, S> extends Account1<T>{

    private S _name;
    S getName(){return _name;}
    DepositAccount2(T id, S name){
        super(id);
        this._name=name;
    }
}

class DepositAccount3 extends Account1<Integer>{

    DepositAccount3(){
        super(5);
    }
}

class Account2
{
    private String _name;
    String getName(){return _name;}
    Account2(String name)
    {
        _name=name;
    }
}

class DepositAccount4<T> extends Account2{

    private T _id;
    T getId(){return _id;}
    DepositAccount4(String name, T id){
        super(name);
        _id = id;
    }
}
