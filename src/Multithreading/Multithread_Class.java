package Multithreading;

public class Multithread_Class extends Thread {
    public static void main(String[] args) throws InterruptedException {
        for (int j = 1 ; j < 5 ; j++){
            Multithread_Class obj = new Multithread_Class(j);
            obj.start();
        }
    }
    private int threadNo;
    public  Multithread_Class(int threadNo){
        this.threadNo = threadNo;
    }
    @Override
    public void run() {
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i + " From Thread " + threadNo);
            try {
                Thread.sleep(1750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}