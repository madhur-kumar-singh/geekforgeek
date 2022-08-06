public class titleCase {
    public static void main(String[] args) {
        String s="this is just ese hi";
        System.out.println(changeToTitle(s));
    }
    public static String changeToTitle(String s){
        String newString="";
        newString+=Character.toUpperCase(s.charAt(0));
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==' '){
                newString+=s.charAt(i);
                newString+= Character.toUpperCase(s.charAt(i+1));
                i++;
                continue;
            }
            newString+=s.charAt(i);
        }
        if(s.charAt(s.length()-2)!=' ')
            newString+=s.charAt(s.length()-1);
        return newString;
    }
}
