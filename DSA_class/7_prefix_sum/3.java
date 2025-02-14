//cricket over and run with queries
import java.util.*;
class Cric{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int n=10;
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int parr[]=new int[n];
		parr[0]=arr[0];
		for(int i=1;i<n;i++){
			parr[i]=parr[i-1]+arr[i];
		}
		System.out.println("Enter query");
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			System.out.println("Enter start and end for query "+(i+1));
			int s=sc.nextInt();
			int e=sc.nextInt();
			int sum=0;
			if(s==0){
				sum=parr[e];
			}else{
				sum=parr[e]-parr[s-1];
			}
			System.out.println("sum of query "+(i+1)+" is "+sum);
		}
	}
}
