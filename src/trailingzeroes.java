public class trailingzeroes {
    public static void main(String[] args) {
        int count=0;
        int n=383;
        for(int i=5;n/i>=1;i*=5)
            count+=n/i;
//        double fac=factorial(384);
//        System.out.println(fac);
//        while(fac>0){
//            if(fac%10!=0) break;
//                count++;
//                fac=fac/10;
//
//        }
        System.out.println(count);
//
//
//    }
//
//    public static double factorial(int n){
//        if(n==1)
//            return 1;
//
//        return n*factorial(n-1);
   }
}
