package OOPs.Non_AccessModifiers;

public class Syncronised {
        int count;
       synchronized void increment(){
            count++;
        }
    }
    class GFG{
        public static void main(String[] args) throws InterruptedException {
            Syncronised c=new Syncronised();

            // Thread 1
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=1;i<=10000;i++){
                        c.increment();
                    }
                }
            });

            // Thread 2
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=1;i<=10000;i++){
                        c.increment();
                    }
                }
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            System.out.println(c.count);
        }
    }


// The above code should be an output value of 20000 as two threads increment it 10000 times each, and the main is waiting for Thread1, Thread2 to finish. Sometimes it may not be true. Depending upon the system, it may not give 20000 as output.  As both threads are accessing the value of count, it may happen that Thread1 fetches the value of count, and before it could increment it, the Thread2 reads the value and increments that. So thus, the result may be less than 20000.  To solve this issue, we use the synchronized keyword. If the synchronized keyword is used while declaring the increment() method, then a thread needs to wait for another thread to complete the operation of the method then only another one can work on it. So we can get guaranteed output of 20000.