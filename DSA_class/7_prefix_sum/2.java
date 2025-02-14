//prefix sum
import java.util.*;
class Prefix{
	public static void main(String[] ar){
		int arr[]=new int[]{1,2,3,4,5,6};
		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i]+arr[i-1];
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
