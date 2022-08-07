public class missingNumber {
    public static void main(String[] args) {
        int A[] = {1, 4, 3};
        int n=A.length+1;
        System.out.println(find(A, n));

    }
    public static int find(int A[],int n){
        int missing=(n*(n+1))/2;
        int sum=0;
        for(int i:A){
            sum+=i;
        }
        return missing-sum;
    }
}
