package question;
/*
 * 父类构造器
 * super()用于显示调用父类构造器，this()用于显示调用本类中重载的构造器，在一个构造函数中super()和this()只能调用一个，而且一次
 * 如果有super()则按照参数调用父类构造器，如果有this()则按照参数调用本类的构造器，如果都没有，则隐式调用父类无参构造器
 */
class Creature{
	{
		System.out.println("Creature的非静态初始化块");
	}
	public Creature(){
		System.out.println("Createur 无参构造函数");
	}
	public Creature(String name){
		System.out.println("Creature 带有name参数的构造函数，name="+name);
	}
}
class Animal extends Creature{
	{
		System.out.println("Animal非静态的初始化块");
	}
	public Animal(String name){
		super(name);
		System.out.println("Animal带有name参数的构造函数，name="+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal的带name和age参数的构造函数，name="+name+"age="+age);
	}
} 
class Wolf extends Animal{
	{
		System.out.println("wolf的非静态初始化块");
	}

	public Wolf() {
		super("灰太狼", 3);
		// TODO Auto-generated constructor 
		System.out.println("wolf的午餐构造器");
		
	}
	public Wolf(double weight){
		this();
		System.out.println("wolf的带weight的构造器，weight="+weight);
	}
	
}

public class father {
	public static void main(String[]args){
		new Wolf(5.6);
		
	}

}
