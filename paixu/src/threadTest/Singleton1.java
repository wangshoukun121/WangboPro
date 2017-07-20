package threadTest;

/**
 * @author wangbo
 *	多线程下适用的单例模式
 *	对实例的创建延迟到实例访问函数的调用时执行，提高程序的启动速度
 *	缺点是：进入getInstance()的线程都得同步，影响读取成员变量的速度
 */
public class Singleton1 {
	private static Singleton1 intance=null;
	private Singleton1(){}
	public static Singleton1 getIntance(){
		synchronized (Singleton1.class) {
			if(intance==null){
				intance=new Singleton1();
			}
			
		}
		return intance;
	}
}
