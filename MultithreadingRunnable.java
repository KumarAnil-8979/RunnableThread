//I am using intellijide for code
public class MultithreadingRunnable {
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}
    class MultithreadingDemo implements Runnable {
        public void run()
        {
            try {
                // Displaying the thread that is running
                System.out.println("Hello India");
            }
            catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }
        }
    }