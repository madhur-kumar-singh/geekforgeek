public class facingSun {
    public static void main(String[] args){
        int[] arr={7,4,8,2,9};
        System.out.println(countBuilding(arr));
    }
    public static int countBuilding(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int count=1;
        for(int i:arr){
            if(i>max){
                count++;
                max=i;
            }
        }
        return count;
    }
}
