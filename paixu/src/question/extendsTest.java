package question;
/*
 * �̳и����Ա�����ͼ̳и��෽��������
 * ���������ı������ͺ�ָ��Ķ��������಻��ͬ��ͨ���������÷���ʱ����������Ϊ����ָ��������Ϊ������ʵ������ʱ��ʵ��������ֵ���Ǳ��ֳ��������͵���Ϊ��
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
	Base b2=d.getsuper();//���ص���d�ĸ���
	System.out.println(b2==d);//��Ȼ��true /(��o��)/~~
}
}
