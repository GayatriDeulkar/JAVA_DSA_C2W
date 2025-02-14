/*Array rotaion given an array of size n and int b you have to r4eturn the same array after rotating it b towards the right constraints 1<=n<=10^5 1<=A[i]<=109 1<=b<=109
 * */


import java.util.*;
class RotatArray{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{1,2,3,4,5,6};
		int n=arr.length;
		System.out.println("Entre b that is rotaion number");
		int b=sc.nextInt();
		b=b%n;//as this gives same value for b

		//Entire array reverse
		for(int i=0;i<n/2;i++){
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}

		//reverse until b
		for(int i=0;i<b/2;i++){
			int temp=arr[i];
			arr[i]=arr[b-1-i];
			arr[b-1-i]=temp;
			
		}

		//reverse remaining array
		for(int i=b;i<(n+b)/2;i++){
			int temp=arr[i];
			arr[i]=arr[n-1-(i-b)];
			arr[n-1-(i-b)]=temp;
		}	

		System.out.println("Rotated arry is : ");
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();

	}
}
