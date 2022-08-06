public class swapPallindrome {
    public static void main(String[] args) {
        String s="kyak";
        char[] str=s.toCharArray();
        if(swap(str))
            System.out.println(str);
        else
            System.out.println(-1);


    }
    public static boolean swap(char[] s){
        if(isPalin(s))
            return true;
        int n=s.length;
        for(int i=0;i<n-1;i++){
            char temp=s[i];
            s[i]=s[i+1];
            s[i+1]=temp;
            if(isPalin(s))
                return true;
            else
            {
                temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
            }
        }
        return false;



    }
    public static boolean isPalin(char[] s){
        int n=s.length;
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=s[i];
        }
        char[] revChar=rev.toCharArray();
        for(int i=0;i<n;i++)
            if(revChar[i]!=s[i])
                return false;
        return true;

    }
}
