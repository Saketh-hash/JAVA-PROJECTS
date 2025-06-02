// Concurrency in Java is a programming technique where multiple tasks are executed simultaneously.
// It is achieved by using multiple threads.
// A thread is a lightweight process that can be scheduled by the operating system.
// A thread can be created by extending the Thread class or implementing the Runnable interface.
// The Thread class has a run() method that is called when the thread is started.

class MyTask extends Thread{
    private String taskName;
    public MyTask(String taskName){
        this.taskName = taskName;
    }
    public void run(){
        for(int i = 0; i <= 3; i++){
            System.out.println(taskName + " Step " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(taskName + " was interrupted");
            }
        }
    }
}

public class Concurrency {
    public static void main(String[] args) {
        MyTask task1 = new MyTask("Task 1");
        MyTask task2 = new MyTask("Task 2");
        task1.start();
        task2.start();
    }
}
