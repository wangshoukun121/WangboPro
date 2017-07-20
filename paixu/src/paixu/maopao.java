package paixu;
/*
 * √∞≈›≈≈–Ú
 * 2016.3.16
 * byÕı≤©
 */
public class maopao {
	public static void maopaopaixu(){
		int [] a={45,23,55,32,12,6,7};
		int cout=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					cout++;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("Ωªªª"+cout+"¥Œ");
	}
public static void main(String[]args){
	maopaopaixu();
}
}
