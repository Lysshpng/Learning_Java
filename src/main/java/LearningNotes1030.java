import java.util.concurrent.*;

class MyThread extends Thread {
    // 继承Thread类, 重写run方法
    @Override
    public void run() {
        System.out.println("MyThread extends Thread");
    }
}

class MyRunnable implements Runnable {
    // 实现Runnable接口, 实现run方法
    @Override
    public void run() {
        System.out.println("MyRunnable implements Runnable");
    }
}

class MyCallable implements Callable<String> {
    // 实现Callable接口, 实现call方法
    @Override
    public String call() throws Exception {
        return "MyCallable implements Callable";
    }
}

public class LearningNotes1030 {

    public static void main(String[] args) {
        // 继承Thread类创建线程
        MyThread myThread = new MyThread();
        myThread.start();

        // 实现Runnable接口创建线程
        MyRunnable myRunnable = new MyRunnable();
        // 将Runnable对象作为参数放入Thread的构造器, 创建Thread类的对象
        Thread thread_1 = new Thread(myRunnable);
        thread_1.start();

        // 实现Callable接口创建线程
        MyCallable myCallable = new MyCallable();
        // 将Callable对象作为参数放入FutureTask构造器, 创建FutureTask类的对象
        FutureTask<String> futureTask = new FutureTask<String>(myCallable);
        // 将FutureTask对象作为参数放入Thread构造器, 创建Thread类的对象
        Thread thread_2 = new Thread(futureTask);
        thread_2.start();
        // 调用FutureTask类的对象的get方法获取线程的返回值
        try {
            Object object = futureTask.get();   // 获取返回值
            System.out.println(object);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        // 使用JDK自带的ExecutorService类的定长线程池创建线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 创建Runnable类对象
        MyRunnable myRunnable_ = new MyRunnable();
        // 将Runnable类对象作为参数放入ExecutorService类对象的execute方法
        executorService.execute(myRunnable_);
        // 关闭线程池
        executorService.shutdown();
    }
}
