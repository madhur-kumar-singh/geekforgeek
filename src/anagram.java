import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String s="act";
        String r="cat";
        System.out.println(isAnagram(s, r));


    }
    public static boolean isAnagram(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }

}
