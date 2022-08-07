public class searchInRotated {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n=arr.length;
        int key=10;
        System.out.println(search(arr, n, key));
    }
    public static int search(int[] arr,int n,int key){
        int pos=-1;
        for(int i:arr){
            pos++;
            if(i==key){
                return pos;
            }
        }
        return -1;
    }
}
