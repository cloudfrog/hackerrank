import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class minimumswaps {
	//https://www.hackerrank.com/challenges/minimum-swaps-2/
    // Complete the minimumSwaps function below.
	//it's like insertion sort i think>????
    static int minimumSwaps(int[] arr) {
    	int l = arr.length;
    	int loc[] = new int[l+1];
    	int ans = 0;
    	for(int i = 0; i < l; i++) {
    		loc[arr[i]]= i;
    	}
    	for(int i = 0; i < l; i++) {
    		if(arr[i] == i+1) continue; /// if position is correct;
    		int pos = loc[i+1]; /// location of the next number
    		///swap in arr[i] and arr[pos];
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] =temp;
			//swap loc[arr[i]] and ;
			loc[arr[i]]=i+1;
			loc[arr[pos]]= pos;
    		ans++;
    		System.out.println(Arrays.toString(arr));
    	}
    	return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
