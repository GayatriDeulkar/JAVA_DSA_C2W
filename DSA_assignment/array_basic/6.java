import java.util.*;
class Sort{
	public static void main(String[] ar){
		int arr[]=new int[]{3,1,5,3,6,2};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
