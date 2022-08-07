public class numberOfOccurrences {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        int n=arr.length;
        int x=2;
        System.out.println(occurrences(arr, n, x));

    }
    public static int occurrences(int[] arr, int n, int x){
        int pos=0;
        int count=0;
        for(int i:arr){
            if(i==x){
                break;
            }
            pos++;
        }
        while(pos<n && arr[pos]==x){
            count++;
            pos++;
        }
        return count;

    }
}
