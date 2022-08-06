public class perfectNumber {
    public static void main(String[] args) {
        int num=6;
        System.out.println(isPerfect(num));

    }
    public static int isPerfect(int n){
        int sum=1;
        if(n==1)
            return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0){
                sum+=i;
                sum+=n/i;
            }
            if(sum==n)
                return 1;
            else
                return 0;}
}
