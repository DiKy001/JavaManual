public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();

        AnotherPerson bob = new AnotherPerson("Bom");
        bob.setAccount("qwerty");

        // Static nested classes
        Math.Factorial fact = Math.getFactorial(6);
        System.out.printf("Factorial of the number %d is %d \n", fact.getKey(), fact.getResult());
    }
}

class Person{

    private String name;
    Account account;

    Person(String name, String password){
        this.name = name;
        account = new Account(password);
    }
    public void displayPerson(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account{
        private String password;

        Account(String pass){
            this.password = pass;
        }
        void displayAccount(){
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}

class AnotherPerson{
    private String name;

    AnotherPerson(String name){
        this.name = name;
    }

    public void setAccount (String password){

        class Account{

            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}

class Math{

    public static class Factorial{

        private int result;
        private int key;

        public Factorial(int number, int x){

            result=number;
            key = x;
        }

        public int getResult(){
            return result;
        }

        public int getKey(){
            return key;
        }
    }

    public static Factorial getFactorial(int x){

        int result=1;
        for (int i = 1; i <= x; i++){

            result *= i;
        }
        return new Factorial(result, x);
    }
}