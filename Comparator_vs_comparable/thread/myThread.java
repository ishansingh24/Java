public class myThread implements Runnable{

    public void task()
    {
        for(int i =0; i < 10; i++)
       {
          System.out.println(i);
       }
    }
    @Override
    public void run() {
       task();
    }
}
