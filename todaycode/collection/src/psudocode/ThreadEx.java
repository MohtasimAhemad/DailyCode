package psudocode;

class ThreadEx extends Thread
{
    public void run()
    {
        System.out.print("Hello...");
    }
    public static void main(String args[])
    {
        ThreadEx T1 = new ThreadEx();
        T1.start();
        T1.stop();
        T1.start();
    }
}