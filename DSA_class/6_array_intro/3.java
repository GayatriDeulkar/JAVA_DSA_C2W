//reverse an array
import java.util.*;
class Reverse{
	public static void main(String[] arg){
		int arr[]={1,4,2,5,2,7};
		int temp=0;
		for(int i=0;i<arr.length/2;i++){
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}


/*
 *
 * or
 *int i=0;
 int j=n-1;
 while(){

 swapping logic
 	i++; j--
 }
 * */
