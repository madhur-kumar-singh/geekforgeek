public class floorInSorted {
    public static void main(String[] args) {
        long[] arr={1,2,8,10,11,12,19};
        long x=5;
        int n=arr.length;
        System.out.println(findFloor(n, arr, x));

    }
    public static int findFloor(int n,long[] arr,long x){
        int pos=-1;

        if(arr[0]>x)
            return pos;
        for(int i=0;i<n;i++){
            if(arr[i]>x)
                break;
            pos=i;
        }
        return pos;
    }
}
