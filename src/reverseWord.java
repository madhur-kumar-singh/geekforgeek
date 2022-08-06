public class reverseWord {
    public static void main(String[] args) {
        String str="i.like.this.madhur";
        System.out.println(reverse(str));

    }
    public static String reverse(String str){
        String[] s=str.split("[.]");
        String newString="";
        int n=s.length;
       for(int i=n-1;i>0;i--){
           newString+=s[i]+".";
        }
       newString+=s[0];
       return newString;
    }
}
