public class maximumIndex {
    public static void main(String[] args) {
        int[] arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(difference(arr));

    }
    public static int difference(int[] arr){
        int max=Integer.MIN_VALUE;
        int r=arr.length-1;
        int l=0;
        while(l<=r){
            if(arr[l]<=arr[r]) {
                max = Math.max(max, r - l);
                r=arr.length-1;
                l++;
            }
            else
                r--;

        }
        return max;

    }
}
