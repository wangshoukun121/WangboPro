package question;
class Price{
	static Price INSTANCE=new Price(2.8);
	final static double initPrice=20;//��final��û��final����ʱ���������final��Ϊ���滻������ 
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
