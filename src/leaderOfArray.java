import java.util.ArrayList;
import java.util.Stack;

public class leaderOfArray {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        leaders(arr);
    }
    public static  void leaders(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int max=arr[n-1];
        stack.add(max);
        for(int i=n-2;i>=0;i--)
            if(arr[i]>max){

                max=arr[i];
                stack.add(max);

            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");

        }
    }
}
