package threadPractice;

public interface Runnable {
    default void run() {
        Integer num = 0;
        while(num < 5) {
            System.out.println(num++);
        }
    }
}
