package codes;

/**
 * @author wangbo
 *String/StringBuffer/StringBuilder
 */
public class Str implements Cloneable {
	private static final String base="base string";
	private static final int count=20000;
	public void stringTest(){
		long begin,end;		
		String test=new String(base);
		begin=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			test=test+"sdd";
		}
		end=System.currentTimeMillis();
		System.out.println(end-begin+"String test");
	}
	public void stringbufferTest(){
		long begin,end;
		StringBuffer sbf=new StringBuffer(base);
		begin =System.currentTimeMillis();
		for(int i=0;i<count;i++){
			sbf=sbf.append("add");
		}
		end=System.currentTimeMillis();
		System.out.println(end-begin+"StringBuffer test");

		
	}
	public void StringbuilderTest(){
		long begin,end;
		StringBuilder sbl= new StringBuilder(base);
		begin=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			sbl.append("add");
		}
		end=System.currentTimeMillis();
		System.out.println(end-begin+"StringBuilder test");
	}
	public static void main(String[]args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Str str=new Str();
		Str str1=(Str) str.clone();
		System.out.println("str==str1"+(str==str1));
		Class objClass=Class.forName("codes.Str");
		Str str2=(Str) objClass.newInstance();
		System.out.println("str2==str"+(str2==str));
		/*Str str=new Str();
		str.stringTest();
		str.StringbuilderTest();
		str.stringbufferTest();*/
		StringBuffer strbf=new StringBuffer("abcsdf");
		strbf.append("sdf");//追加
		StringBuffer yy=new StringBuffer("");
		System.out.println(strbf.substring(1,4));//截取
		strbf.setCharAt(0, 'g');//改字符
		System.out.println(strbf);
		System.out.println(strbf.reverse());//反转
		strbf.replace(1, 4, "hhh");
		System.out.println(strbf);
		strbf.insert(1, "lalalala");//插入
		System.out.println(strbf+"77777777777777777");
		strbf.delete(1, 1+1);//删除
		System.out.println(strbf+"888888888888888888888");
		String strbf1=new String("abcsdf");
		String strbf2="abcsdf";
		String strbf3="abcsdf";
		System.out.println(strbf2==strbf3);
		System.out.println(strbf1.equals(strbf2));
		System.out.println(strbf1==strbf2);
		System.out.println(strbf1.intern()==strbf2);
		//intern public String intern()返回字符串对象的规范化表示形式。 一个初始时为空的字符串池，它由类 String 私有地维护。 
		//当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。
		String a="a";
		String b="b";
		String c=a+b;
		String d="a"+"b";
		System.out.println(c=="ab");
		System.out.println(c.equals("ab"));
		System.out.println(d==c);
		System.out.println(str.getClass().getName());//反射机制获取对象的类名和包名
	}

}
