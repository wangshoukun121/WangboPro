package question;
/*
 * 继承父类成员变量和继承父类方法的区别
 * 不管声明的变量类型和指向的对象类型相不相同，通过变量调用方法时，方法的行为总是指向对象的行为，访问实例变量时，实例变量的值总是表现出变量类型的行为。
 */
class Base{
	int count=2;
	public int getInfo(){
		int age=5;
		return age;
	}
	public Base getthis(){
		return this;
	}
}
class Derived extends Base{
	String name="hdsf";

	@Override
	public int getInfo() {
		// TODO Auto-generated method stub
		int age=10;
		return age;
	}
	public Base getsuper(){
		return super.getthis();
	}
	
	
}
public class extendsTest {
public static void main(String[]args){
	Base b=new Base();
	System.out.println(b.count+" "+b.getInfo());
	Derived d=new Derived();
	System.out.println(d.count+" "+ d.getInfo());
	Base bd=new Derived();
	System.out.println(bd.count+" "+bd.getInfo());
	Base b2d=d;
	System.out.println(b2d.count+" "+b2d.getInfo());
	System.out.println(b2d.getClass()+" "+bd.getClass());
	//
	Base b2=d.getsuper();//返回的是d的父类
	System.out.println(b2==d);//居然是true /(ㄒoㄒ)/~~
}
}
