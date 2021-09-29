package threadPractice;

import java.lang.Integer;

public class ThreadExercises extends Thread implements Runnable{

    public static void main(String[] args) throws InterruptedException{
        //Exercise #1
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();//should execute the run method first then it will activate its class lock
        thread1.sleep(2000);
        thread2.start();
        thread2.sleep(2000);
        System.out.print("_Exercise 2_");

        //Exercise 3
        //start three threads
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();
        Thread thread5 = new Thread();
        thread3.start();
        thread3.sleep(1000);
        //next thread is executed after there is a lock on the previous thread
        thread4.start();
        thread5.start();

        //Exercise 3
        ThreadExercises thread6 = new ThreadExercises();
        thread6.setName("My First Thread");
        ThreadExercises thread7 = new ThreadExercises();
        thread7.setName("My Second Thread");
        ThreadExercises thread8 = new ThreadExercises();
        thread8.setName("My Third Thread");
       thread6.start();
        thread6.sleep(1000);
//        //next thread is executed after there is a lock on the previous thread
//        thread7.join();
//        thread7.start();
//        thread8.start();

        //Exercise 4
        Thread thread9 = new Thread();
        Thread thread10 = new Thread();
        Thread thread11 = new Thread();
        thread9.setName("Thread-0");
        thread9.setPriority(MIN_PRIORITY);
        thread10.setName("Thread-1");
        thread10.setPriority(NORM_PRIORITY);
        thread11.setName("Thread-2");
        thread11.setPriority(MAX_PRIORITY);
        thread9.sleep(2000);
        System.out.println(thread9.getName());
        System.out.println(thread9.getPriority());
        System.out.println("--------------");
        System.out.println(thread10.getName());
        System.out.println(thread10.getPriority());
        thread10.sleep(2000);
        System.out.println("---------------");
        System.out.println(thread11.getPriority());
        System.out.println(thread11.getName());
        thread11.sleep(2000)  ;
        System.out.println("______________");

        //Exercise 5






    }

    //Runnable method that gets implemented everytime a thread uses its start method
    @Override
    public void run() {
        Integer num = 1;
        while(num < 6) {
            System.out.println(num++);
        }
    }

}







