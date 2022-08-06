import java.util.Locale;

public class saveIronman {
    public static void main(String[] args) {
        String s="Ab?/1ba";
        System.out.println(check(s));

    }
    public static boolean check(String s){
        s=s.toLowerCase(Locale.ROOT);
        String newString="";
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=123 || (int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
                newString+=s.charAt(i);
        }
        String rev="";
        for(int i=newString.length()-1;i>=0;i--)
            rev+=newString.charAt(i);
        if(newString.equals(rev))
            return true;
        else
            return false;


    }
}
