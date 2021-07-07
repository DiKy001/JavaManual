import java.util.concurrent.Semaphore;

public class Program {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1); // 1 permission
        CommonResource res = new CommonResource();
        new Thread(new CountThread(res, sem, "CountThread 1")).start();
        new Thread(new CountThread(res, sem, "CountThread 2")).start();
        new Thread(new CountThread(res, sem, "CountThread 3")).start();

        Semaphore sem1 = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem1,i).start();
    }
}
class CommonResource{

    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    Semaphore sem;
    String name;
    CountThread(CommonResource res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){

        try{
            System.out.println(name + " pending permission");
            sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name + " releases permission");
        sem.release();
    }
}

class Philosopher extends Thread
{
    Semaphore sem; // semaphore limiting the number of philosophers
    // number of meals
    int num = 0;
    // philosopher's conditional number
    int id;
    // as parameters of the constructor, we pass the identifier of the philosopher and the semaphore
    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try
        {
            while(num<3)// until the number of meals reaches 3
            {
                // Requesting execution permission from the semaphore
                sem.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                // philosopher eating
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();

                // philosopher walks
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}