package threadTest;

public class SecondThread implements Runnable{
private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
public static void main(String[] args){
	
			SecondThread sth=new SecondThread();
			new Thread(sth).start(); 
			new Thread(sth).start();
		
	
}
}
