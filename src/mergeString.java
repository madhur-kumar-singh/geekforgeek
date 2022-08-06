public class mergeString {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Bye";
        ///notDoneYet
        System.out.println(mergerStringAlter(s1, s2));

    }
    public static StringBuffer mergerStringAlter(String s1,String s2){
        int l1=s1.length(),l2=s2.length();
        StringBuffer newString=new StringBuffer();
        if(l1>l2) {
            for (int i = 0; i < l2; i++) {
                newString.append(s1.charAt(i));
                newString.append(s2.charAt(i));
            }
            for(int i=l2;i<l1;i++)
                newString.append(s1.charAt(i));
        }
        else
        {
            for (int j = 0; j < l1; j++) {
                newString.append(s1.charAt(j));
                newString.append(s2.charAt(j));
            }
            for(int j=l1;j<l2;j++)
                newString.append(s2.charAt(j));
        }
        return newString;

    }
}
