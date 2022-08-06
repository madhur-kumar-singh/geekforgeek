public class waveArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        convert(arr);
        for(int i:arr)
            System.out.print(i+" ");

    }
    public static int[] convert(int[] arr){
        int n=arr.length;
        if(n%2!=0)
            n-=1;
        for(int i=0;i<n;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
}
