package ua.lviv.lgs.Fibonachi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorServices {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new MyThread());
		executorService.execute(new RunnableThread());
		
		
	}
	
	
	
	
	
	

}
