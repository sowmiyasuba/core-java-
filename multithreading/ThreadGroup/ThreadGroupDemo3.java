package ThreadGroup;

public class ThreadGroupDemo3 {
    public static void main(String[] args) {
        ThreadGroup system1 = Thread.currentThread().getThreadGroup().getParent();

        Thread[] t = new Thread[system1.activeCount()];
        //how many list of threads are here in system thread group
        system1.enumerate(t);
       for(Thread t1: t)
       {
           System.out.println(t1.getName()+ "---"+ t1.isDaemon());
       }
    }


}
