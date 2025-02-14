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

/*  Optimize approach
import java.util.*;

class Pair {
    public static void main(String[] ar) {
        char arr[] = {'a', 'b', 'e', 'g', 'a', 'g'};
        int cnt = 0;
        int countG = 0; // Number of 'g' seen so far (right to left)
        int n = arr.length;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 'g') {
                countG++; // Found a 'g', update count
            } else if (arr[i] == 'a') {
                cnt += countG; // If 'a' found, add count of 'g' seen so far
            }
        }

        System.out.println(cnt);
    }
}

*/
