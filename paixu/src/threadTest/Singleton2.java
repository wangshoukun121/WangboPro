package threadTest;

/**
 * @author wangbo
 *	double check
 *	第一个条件是说，如果实例创建了，那就不需要同步了，直接返回就好了。
 *	不然，我们就开始同步线程。
 *	第二个条件是说，如果被同步的线程中，有一个线程创建了对象，那么别的线程就不用再创建了。
 */
public class Singleton2 {
	private static Singleton2 intance;
	private Singleton2(){}
	public Singleton2 getIntance(){
		if(intance==null){
			synchronized (Singleton2.class) {
				if(intance==null)
					intance=new Singleton2();
			}
		}
		return intance;
	}
}
