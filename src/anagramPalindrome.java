import java.util.HashMap;

public class anagramPalindrome {
    public static void main(String[] args) {
        String s1="geeksfogeeks";
        System.out.println(check(s1));
    }
    public static boolean check(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(map.containsKey((s.charAt(i))))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        int temp=0;
        for (Integer num:map.values() ) {
            if(num%2!=0)
                temp++;

        }
        if(temp>1)
            return false;
        return true;
    }
}
