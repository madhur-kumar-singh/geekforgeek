import java.util.HashMap;

public class kAnagram {
    public static void main(String[] args) {
        String s1="qufefzniwrhar";
        String s2="lzvnmuhlexhec";

        System.out.println(solution(s1, s2,7));

    }
    public static boolean solution(String s1,String s2,int k){
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i)+1));
            }
            else
                map.put(s1.charAt(i),1);
        }
        int counter=0;
        for(int i=0;i<s2.length();i++) {
            char ch=s2.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 1)
                    map.put(ch, map.get(ch - 1));
                else
                    map.remove(ch);
            }
        }
//        for(char key:map.keySet()){
//            counter+=map.get(key);
       // }
        System.out.println(map.size());
        if (counter<=k){
            return true;
        }
        return false;


    }
}
