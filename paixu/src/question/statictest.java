package question;
/*
 * �������ʼ��
 * ������������ж���ı�static���εı�������ʼ�������ַ���
 * 1�ڱ�������ʱ��ʼ��
 * 2�ھ�̬��ʼ�����ʼ��
 * ʵ������������ж���ķǾ�̬��������ʼ������
 * 1�ڱ�������ʱ��ʼ��
 * 2�ڷǾ�̬��ʼ�����ʼ��
 * 3�ڹ��캯���г�ʼ��
 */
class Person{
	String name;
	int age;
	static double weight;
	public Person(String name,int age){
		System.out.println(name+age);
	}
	public String infor(){
		return name+age;
	}
}
public class statictest {
public static void main(String[]args){
	  String a="google";
	  int flag=0;
		while(a.length()>2){
			System.out.println(a.length());
			flag++;
			System.out.println(flag);
			a=a.substring(0,a.length()-flag);
		}
	
}
}
