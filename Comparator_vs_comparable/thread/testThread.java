
public class testThread {
    public static void main(String []args)
    {
        System.out.println("hello ji");
        // myThread m1 = new myThread();
        // myThread m2 = new myThread();

        // Thread thread = new Thread(m1);
        // Thread thread2 = new Thread(m2);
        // thread.start();
        // thread2.start();

        // mythread2 t1 = new mythread2();
        // mythread2 t2 = new mythread2();

        // t1.start();
        // t2.start();


        // Anonymous class for creating the thread
        // Runnable at1 = new Runnable() {
        //     @Override
        //     public void run()
        //     {
        //         for(int i =0; i < 10; i++)
        //            {
        //               System.out.println(i);
        //            }
        //     }
        // };

        Runnable at1 = ()->{
            for(int i =0; i < 10; i++)
                {
                    System.out.println(i);
                }
        };

        Thread t1 = new Thread(at1);
        t1.start();
        Thread t2 = new Thread(at1);
        t2.start();

    }
}
