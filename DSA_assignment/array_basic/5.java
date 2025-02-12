// replace all zero wiht 5
import java.util.*;
class Replace{
	public static void main(String[] a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a num");
		int num=sc.nextInt();
		int cor=0;
		int place=1;
		while(num!=0){
			int rem=num%10;
			num=num/10;
			if(rem==0){
				rem=5;	
			}
			cor=cor+rem*place;
			place=place*10;
		}
		System.out.println(cor);
	}
}
