package ThreadGroup;

public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup g2 = new ThreadGroup("ThreadGroupMain");
        System.out.println(g2.getParent().getName());
        Thread g3 = new Thread(g2,"FirstGroup");

        Thread g4 = new Thread(g2,"SecondGroup");

        g2.setMaxPriority(3);
        //till g4 priority would be five and from g5 it would be 3
        Thread g5 = new Thread(g2,"ThirdGroup");

        System.out.println(g3.getPriority());
        System.out.println(g4.getPriority());
        System.out.println(g5.getPriority());

    }

}
