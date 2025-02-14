//Rightmax array
import java.util.*;
class RightMax{
	public static void main(String[] ar){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int RightMax[]=new int[n];
		RightMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
	
			if(RightMax[i+1]<arr[i]){
				RightMax[i]=arr[i];
			}else{
				RightMax[i]=RightMax[i+1];
			}
		}
		System.out.println("RightMax array : ");
		for(int num:RightMax){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
