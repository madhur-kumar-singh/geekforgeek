import java.util.LinkedHashSet;
import java.util.Scanner;

public class distinct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }


            LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

            // adding elements to LinkedHashSet
            for (int i = 0; i < arr.length; i++)
                set.add(arr[i]);
            System.out.println(set.size());
        }
    }
}
