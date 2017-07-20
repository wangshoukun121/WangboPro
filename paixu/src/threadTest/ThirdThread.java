package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread implements Callable {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		for(;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		return i;
	}
	public static void main(String[]args){
		ThirdThread tth=new ThirdThread();
		FutureTask<Integer> task=new FutureTask<Integer>(tth);
		FutureTask<Integer> task2=new FutureTask<Integer>(tth);
		Thread t1= new Thread(task,"11");
		Thread t2= new Thread(task,"22");
	    
	    t1.start();
	    t2.start();
	  //  t2.stop();
		try{
			System.out.println("返回值"+task.get());
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
