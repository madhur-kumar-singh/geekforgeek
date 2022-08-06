public class minimumDistance {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,8,6};
        int x=1;
        int y=2;
        System.out.println(minimumDistanceIndex(arr, x, y, arr.length));
    }
    public static int minimumDistanceIndex(int[] arr,int x,int y,int n){
        int first=-1,second=-1;
        int min_num=Integer.MAX_VALUE;
        for( int i=0;i<n;i++){
            if(arr[i]==x) first=i;
            if(arr[i]==y) second=i;
            if(first!=-1 && second !=-1)
                min_num=Math.min(min_num,Math.abs(first-second));
        }

        if(first==-1 || second ==-1)
            return -1;
        return min_num;
    }
}
