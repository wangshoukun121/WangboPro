package question;
/*
 * ���๹����
 * super()������ʾ���ø��๹������this()������ʾ���ñ��������صĹ���������һ�����캯����super()��this()ֻ�ܵ���һ��������һ��
 * �����super()���ղ������ø��๹�����������this()���ղ������ñ���Ĺ������������û�У�����ʽ���ø����޲ι�����
 */
class Creature{
	{
		System.out.println("Creature�ķǾ�̬��ʼ����");
	}
	public Creature(){
		System.out.println("Createur �޲ι��캯��");
	}
	public Creature(String name){
		System.out.println("Creature ����name�����Ĺ��캯����name="+name);
	}
}
class Animal extends Creature{
	{
		System.out.println("Animal�Ǿ�̬�ĳ�ʼ����");
	}
	public Animal(String name){
		super(name);
		System.out.println("Animal����name�����Ĺ��캯����name="+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal�Ĵ�name��age�����Ĺ��캯����name="+name+"age="+age);
	}
} 
class Wolf extends Animal{
	{
		System.out.println("wolf�ķǾ�̬��ʼ����");
	}

	public Wolf() {
		super("��̫��", 3);
		// TODO Auto-generated constructor 
		System.out.println("wolf����͹�����");
		
	}
	public Wolf(double weight){
		this();
		System.out.println("wolf�Ĵ�weight�Ĺ�������weight="+weight);
	}
	
}

public class father {
	public static void main(String[]args){
		new Wolf(5.6);
		
	}

}
