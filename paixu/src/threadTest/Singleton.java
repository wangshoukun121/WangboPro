package threadTest;

/**
 * @author wangbo
 *	单例模式
 */

/**
 * 适用于单线程环境，在多线程情况下可能会得到多个实例
 * 1私有（private）的构造函数，表明这个类是不可能形成实例了。这主要是怕这个类会有多个实例。
 * 2即然这个类是不可能形成实例，那么，我们需要一个静态的方式让其形成实例：getInstance()。注意这个方法是在new自己，因为其可以访问私有的构造函数，
 * 所以他是可以保证实例被创建出来的。
 * 3在getInstance()中，先做判断是否已形成实例，如果已形成则直接返回，否则创建实例。
 * 4所形成的实例保存在自己类中的私有成员中。
 * 5我们取实例时，只需要使用Singleton.getInstance()就行了。
 */
public class Singleton {
	//私有构造函数
	private Singleton(){}
	//内部定义一个私有实例，只供内部调用
	private static Singleton instance=null;
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
		 
	}
	

}
