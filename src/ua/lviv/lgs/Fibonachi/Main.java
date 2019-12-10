package ua.lviv.lgs.Fibonachi;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Потік Thread");
		System.out.println();
        MyThread myThread = new MyThread();
        
        myThread.start();
        
        
        myThread.join();
        System.out.println();
        System.out.println("Потік Runnable");
        System.out.println();
        Thread thread = new Thread(new RunnableThread());
        thread.start();

	}

}
