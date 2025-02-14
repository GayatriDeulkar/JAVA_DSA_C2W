
/*given an array of size n and q number of queries it conatins staring and ending index print ht sum of elemnt from index start to end */

import java.util.*;
class PrefexSum{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int arr[]={4,2,6,4,3,4,2,3};
		for(int i=0;i<q;i++){
			int sum=0;
			System.out.println("enter s");
			int s=sc.nextInt();
			System.out.println("enter e");
			int e=sc.nextInt();
			for(int j=s;j<=e;j++){
				sum=sum+arr[j];
			}
			System.out.println("sum is "+sum);
		}
	}
}
