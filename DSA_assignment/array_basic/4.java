import java.util.*;

public class ProductModulo {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of elements
            long product = 1; // Use long to handle large numbers

            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                product = (product * num) % MOD; // Apply modulo at each step
            }

            System.out.println(product);
        }
        sc.close();
    }
}
/*4] Product of array elements

This is a functional problem. Your task is to return the product of array elements
under a given modulo.
The modulo operation finds the remainder after the division of one number by
another. For example, K(mod(m))=K%m= remainder obtained when K is divided
by m
Example 1:
Input:
1
4
1 2 3 4
Output:
24
Input:
The first line of input contains T denoting the number of test cases. Then each of
the T lines contains a single positive integer N denotes the number of elements in
the array. The next line contains 'N' integer elements of the array.

Output:
Return the product of array elements under a given modulo.
That is, return (Array[0]*Array[1]*Array[2]...*Array[n])%modulo.
Constraints:
1<=T<=200
1<=N<=10^5
1<=ar[i]<=10^5*/
