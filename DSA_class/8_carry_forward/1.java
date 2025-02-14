//Leftmax array
import java.util.*;
class LeftMax{
	public static void main(String[] ar){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int leftMax[]=new int[n];
		leftMax[0]=arr[0];
		for(int i=1;i<n;i++){
			if(leftMax[i-1]<arr[i]){
				leftMax[i]=arr[i];
			}else{
				leftMax[i]=leftMax[i-1];
			}
		}
		System.out.println("LeftMax array : ");
		for(int num:leftMax){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
