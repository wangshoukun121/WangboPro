package question;
class Price{
	static Price INSTANCE=new Price(2.8);
	final static double initPrice=20;//有final和没有final修饰时输出的区别；final作为宏替换的意义 
	double currentPrice;
	public Price(double discount){
		currentPrice=initPrice-discount;
	}
}
public class finalTest {
	public static void main(String[]args){
		
		System.out.println(Price.INSTANCE.currentPrice);
		Price p=new Price(2.8);
		System.out.println(p.currentPrice);
		String s1="fengzi";
	}

}
