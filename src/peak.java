public class peak {
    public static void main(String[] args) {
        int[] arr={213 ,509, 129 ,898, 766 ,198 ,131};
        int n=arr.length;
        System.out.println(peakFind(arr, n));

    }
    public static int peakFind(int[] arr,int n){
        int peak=arr[0];
        int pos=-1;
        if(n==1)
            return 0;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<=peak && arr[i+1]<peak);
            else {peak=arr[i];
            pos=i;
            }
        }
        if(peak<arr[n-1])
            pos=n-1;
        return pos;
    }
}
