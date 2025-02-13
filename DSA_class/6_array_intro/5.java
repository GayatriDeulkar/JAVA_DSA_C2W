//return sum pf pair of 1st and last elements of array if odd number of array then return middle element as it is
import java.util.*;
class SumPair{
	public static void main(String[] arg){
		int arr[]={3,1,3,4,5,3,6,9,7,0,8};
		for(int i=0;i<arr.length/2;i++){
			System.out.println(arr[i]+arr[arr.length-i-1]);
		}
		if(arr.length%2==1){
			System.out.println(arr[arr.length/2]);
		}
	}
}
