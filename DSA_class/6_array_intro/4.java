// second largest element

import java.util.*;
class Largest{
	public static void main(String[] arh){
		int arr[]={5,3,4,5,7,6,2,3,1,9};
		int n=10;
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				smax=max;
				max=arr[i];
				
			}
		}
		System.out.println(max);
		System.out.println(smax);
	}
}
