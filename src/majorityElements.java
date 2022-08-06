import java.util.HashMap;

public class majorityElements {
    public static void main(String[] args) {
        int[] arr={3,1,3,3,2};
        System.out.println(majority(arr));

    }
    public static int majority(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int maxValue=Integer.MIN_VALUE;
        int maxFeq=Integer.MIN_VALUE;
        for(Integer val:map.keySet() ){
            if(map.get(val)>maxFeq){
                maxFeq=map.get(val);
                maxValue=val;
            }
        }
        if(maxFeq>(arr.length/2))
            return maxValue;
        else
            return -1;
    }
}
