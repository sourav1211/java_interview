package Synchronization;

public class Student {

    int counter;

    private synchronized void increment(){
        this.counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Student student= new Student();
        Thread t1= new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            student.increment();
                        }
                    }
                }
        );
        Thread t2= new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            student.increment();
                        }
                    }
                }
        );

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(student.counter);
    }
}
