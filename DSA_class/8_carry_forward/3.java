//Google Given a char array lowercase return the count of pair(i.j) such that i<j arr[i]='a' arr[j]='g' 
import java.util.*;
class Pair{
	public static void main(String[] ar){
		char arr[]=new char[]{'a','b','e','g','a','g'};
		int cnt=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]=='a'){
				for(int j=i+1;j<n;j++){
					if(arr[j]=='g' && i<j){
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}
