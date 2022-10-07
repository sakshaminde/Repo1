package thread1;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
	public void run()
	{
		try
		{
			Long duration = (long) (Math.random()*5);
			System.out.println("Running Task!");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Completed");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
