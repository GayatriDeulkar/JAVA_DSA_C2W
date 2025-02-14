//previous code without using parr that is extra array
import java.util.*;
class Cric{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int n=10;
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<n;i++){
			arr[i]=arr[i-1]+arr[i];
		}
		System.out.println("Enter query");
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			System.out.println("Enter start and end for query "+(i+1));
			int s=sc.nextInt();
			int e=sc.nextInt();
			int sum=0;
			if(s==0){
				sum=arr[e];
			}else{
				sum=arr[e]-arr[s-1];
			}
			System.out.println("sum of query "+(i+1)+" is "+sum);
		}
	}
}
