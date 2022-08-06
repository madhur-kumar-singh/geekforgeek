import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            String ans="NO";
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++)
                    for (int k = j+1; k < n; k++) {
                        int sum=arr[i]+arr[j]+arr[k];
                        if(sum%10==3) {
                            ans = "YES";
                            break;
                        }
                    }
            }
            System.out.println(ans);
        }
    }
}
