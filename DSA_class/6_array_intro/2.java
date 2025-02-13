/*

  given an array of size n return the count of pairs (i,j) with arr[i]+arr[j]=k 
 	arr=[3,5,2,1,-3,7,8,15,6,13]  n=10 k=10 note i!=j output=6 
 
*/

import java.util.*;
class Two{
	public static void main(String[] ar){
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int n=10;
		int k=10;
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==k && i!=j){
					cnt++;
				}
			}
		}
		System.out.println(2*cnt);
	}
}
