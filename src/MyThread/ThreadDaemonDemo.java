package MyThread;

public class ThreadDaemonDemo {

    public static void main(String[] args) {

        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程为刘备(这个地方相当于把main方法名改为刘备，而main方法是主线程，所以说刘备是主线程})
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
