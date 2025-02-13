/*Given array of size N coount the element having atleast 1 ele greater that itself 
 * arr[2,5,1,4,8,0,8,1,3,8] n=10 output=7 */





import java.util.*;
class Demo{
	public static void main(String[] ar){
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int n=10;
		int cnt=0;
		/*brute force approach
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]<arr[j]){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		time complexity=O(n^2)
		*/

		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++){
			if(max>arr[i]){
				cnt++;
			}
		}
		System.out.println(cnt);
		//time complexitu=O(n)
	}
}
